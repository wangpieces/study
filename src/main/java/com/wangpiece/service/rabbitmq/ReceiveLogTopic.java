package com.wangpiece.service.rabbitmq;

import com.rabbitmq.client.*;
import com.wangpiece.utils.rabbitmq.ConnectionUtils;

import java.io.IOException;
import java.util.Random;

/**
 * 消费者
 */
public class ReceiveLogTopic {

    private static final String ROUTING_KEYS[] = new String[]{"*.orange.*","*.*.rabbit","lazy.#"};

    public static void main(String[] args) {
        Connection connection = ConnectionUtils.getConnection();
        Channel channel = null;
        try {
            channel = connection.createChannel();
            channel.exchangeDeclare(EmitLogTopic.EXCHANGE_NAME, EmitLogTopic.EXCHANGE_TYPE);
            String queueName = channel.queueDeclare().getQueue();
            String routingKey = ROUTING_KEYS[new Random().nextInt(ROUTING_KEYS.length)];
            System.out.println("routing key = " + routingKey);
            channel.queueBind(queueName, EmitLogTopic.EXCHANGE_NAME,routingKey);
            Consumer comsumer = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope,
                                           AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String message = new String(body, "UTF-8");
                    System.out.println("receice message = " + message +" routingKey = " + envelope.getRoutingKey());
                }
            };
            channel.basicConsume(queueName,true,comsumer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

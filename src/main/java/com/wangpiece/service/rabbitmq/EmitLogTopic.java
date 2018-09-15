package com.wangpiece.service.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.wangpiece.utils.rabbitmq.ConnectionUtils;

import java.io.IOException;
import java.util.Random;

/**
 * 生产者
 */
public class EmitLogTopic {

    protected static final String EXCHANGE_NAME = "log_topic";
    protected static final String EXCHANGE_TYPE = "topic";
    protected static final String ROUTING_KEYS[] = new String[]{"quick.orange.rabbit",
            "lazy.orange.elephant","quick.orange.fox","lazy.brown.fox","lazy.pink.rabbit",
            "quick.brown.fox","quick.orange.male.rabbit","lazy.orange.male.rabbit"};

    public static void main(String[] args) {

        Connection connection = ConnectionUtils.getConnection();
        Channel channel = null;
        try {
            channel = connection.createChannel();
            channel.exchangeDeclare(EXCHANGE_NAME, EXCHANGE_TYPE);
            String routingKey = ROUTING_KEYS[new Random().nextInt(ROUTING_KEYS.length)];
            String message = "message: " + routingKey + "";
            channel.basicPublish(EXCHANGE_NAME,routingKey, null, message.getBytes());
            System.out.println("send message = " + message + " routing key = " + routingKey);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            ConnectionUtils.closeChannel(channel);
            ConnectionUtils.closeConnection(connection);
        }
    }
}

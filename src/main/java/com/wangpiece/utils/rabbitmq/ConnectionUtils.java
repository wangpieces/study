package com.wangpiece.utils.rabbitmq;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ConnectionUtils {

    private static final Integer PORT = 5672;
    private static final String HOST = "192.168.213.128";
    private static final String USERNAME = "guest";
    private static final String PASSWORD = "guest";
    private static Connection connection = null;

    /**
     * 链接rabbitmq相关操作
     * @return
     */
    public static Connection getConnection() {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(HOST);
        factory.setPort(PORT);
        factory.setUsername(USERNAME);
        factory.setPassword(PASSWORD);
        try {
            synchronized (Object.class) {
                if (connection == null) {
                    synchronized (Object.class) {
                        if (connection == null) {
                            connection = factory.newConnection();
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        if(connection != null){
            try {
                connection.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeChannel(Channel channel) {
        if(channel != null){
            try {
                channel.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }
    }
}

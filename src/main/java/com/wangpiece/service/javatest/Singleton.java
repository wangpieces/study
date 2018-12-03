package com.wangpiece.service.javatest;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-28 19:20
 */
public class Singleton {

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

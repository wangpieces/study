package com.wangpiece.service.spring.aop;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-06 22:43
 */
public class MyLogger {

    public static void begin(){
        System.out.println("MyLogger.begin()");
    }

    public static void end(){
        System.out.println("MyLogger.end()");
    }
}

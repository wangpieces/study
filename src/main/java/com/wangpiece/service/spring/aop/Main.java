package com.wangpiece.service.spring.aop;

/**
 * @author wang.xu
 * @desc 静态代理
 * @date 2018-11-06 22:48
 */
public class Main {

    public static void main(String[] args) {
        IHello iHello = new ProxyHello(new HelloImpl());
        iHello.sayHello();
    }
}

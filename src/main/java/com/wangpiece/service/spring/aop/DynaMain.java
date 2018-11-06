package com.wangpiece.service.spring.aop;

/**
 * @author wang.xu
 * @desc 动态代理
 * @date 2018-11-06 23:04
 */
public class DynaMain {

    public static void main(String[] args) {
        IHello iHello = (IHello) new DynaProxyHello().bind(new HelloImpl());
        iHello.sayHello();
    }
}

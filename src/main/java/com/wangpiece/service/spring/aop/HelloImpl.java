package com.wangpiece.service.spring.aop;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-06 22:41
 */
public class HelloImpl implements IHello{
    /**
     * sayHello method
     */
    @Override
    public void sayHello() {
        System.out.println("HelloImpl.sayHello()");
    }
}

package com.wangpiece.service.designpattern.decorator;

/**
 * @author wang.xu
 * @desc
 * @date 2018-09-24 23:04
 */
public class ConcreteDecoratorA extends Decorator{

    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecoratorA");
    }
}

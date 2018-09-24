package com.wangpiece.service.designpattern.decorator;

/**
 * @desc
 * @author wang.xu
 * @date 2018-09-24 23:06
 */
public class ConcreteDecoratorB extends Decorator{

    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecoratorB");
    }
}

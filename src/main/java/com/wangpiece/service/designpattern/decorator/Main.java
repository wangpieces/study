package com.wangpiece.service.designpattern.decorator;

/**
 * @author wang.xu
 * @desc
 * @date 2018-09-24 23:06
 */
public class Main {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decoratorA =  new ConcreteDecoratorA();
        Decorator decoratorB = new ConcreteDecoratorB();

        decoratorA.setComponent(component);
        decoratorB.setComponent(decoratorA);
        decoratorB.operation();
    }
}

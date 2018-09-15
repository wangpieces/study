package com.wangpiece.service.designpattern.factory;

/**
 * 简单工厂方法
 */
public class SimpleFactoryMain {

    public static void main(String[] args) {
        IOperation operation = OperationFactory.getOperation("+");
        Number result = operation.getResult(100, 200);
        System.out.println("result = " +result);
    }
}

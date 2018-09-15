package com.wangpiece.service.designpattern.factory;

/**
 * 工厂方法
 */
public class FactoryMethodMain {

    public static void main(String[] args) {
        IOperationFactory operationFactory = new OperationAddFactory();
        IOperation operation = operationFactory.getOperation();
        System.out.println(operation.getResult(100, 200));
    }
}

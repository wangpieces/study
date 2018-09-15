package com.wangpiece.service.designpattern.factory;

public class OperationFactory {

    public static IOperation getOperation(String witchChoose) {
        IOperation operation = null;
        switch (witchChoose) {
            case "+": operation = new OperationAdd(); break;
            case "-": operation = new OperationSub(); break;
            case "*": operation = new OperationMul(); break;
            case "/": operation = new OperationDiv(); break;
            default: throw new RuntimeException("参数不对!");
        }
        return operation;
    }
}

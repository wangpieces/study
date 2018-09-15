package com.wangpiece.service.designpattern.factory;

public class OperationSubFactory implements IOperationFactory{
    @Override
    public IOperation getOperation() {
        return new OperationSub();
    }
}

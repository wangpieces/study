package com.wangpiece.service.designpattern.factory;

public class OperationAddFactory implements IOperationFactory{
    @Override
    public IOperation getOperation() {
        return new OperationAdd();
    }
}

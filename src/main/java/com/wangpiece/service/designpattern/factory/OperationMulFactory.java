package com.wangpiece.service.designpattern.factory;

public class OperationMulFactory implements IOperationFactory{
    @Override
    public IOperation getOperation() {
        return new OperationMul();
    }
}

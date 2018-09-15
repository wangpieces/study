package com.wangpiece.service.designpattern.factory;

public class OperationDivFactory implements IOperationFactory{
    @Override
    public IOperation getOperation() {
        return new OperationDiv();
    }
}

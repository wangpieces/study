package com.wangpiece.service.designpattern.factory.abstractfactory;

public class OracleFactory implements IFactory{
    @Override
    public IUser getUserImpl() {
        return new OracleUserImpl();
    }

    @Override
    public IDepartment getDepartmentImpl() {
        return new OracleDepartmentImpl();
    }
}
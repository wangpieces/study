package com.wangpiece.service.designpattern.factory.abstractfactory;

public class MysqlFactory implements IFactory{
    @Override
    public IUser getUserImpl() {
        return new MysqlUserImpl();
    }

    @Override
    public IDepartment getDepartmentImpl() {
        return new MySqlDepartmentImpl();
    }
}

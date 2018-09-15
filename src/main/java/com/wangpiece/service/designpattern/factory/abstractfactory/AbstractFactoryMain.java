package com.wangpiece.service.designpattern.factory.abstractfactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        IFactory factory = new OracleFactory();
        IUser iUser = factory.getUserImpl();
        iUser.insertUser(null);

        IDepartment department = factory.getDepartmentImpl();
        department.insertDepartment(null);
    }
}

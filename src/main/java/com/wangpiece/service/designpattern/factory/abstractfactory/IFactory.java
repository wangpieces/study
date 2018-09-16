package com.wangpiece.service.designpattern.factory.abstractfactory;

/**
 * 抽象工厂
 */
public interface IFactory {

    IUser getUserImpl();
    IDepartment getDepartmentImpl();
}

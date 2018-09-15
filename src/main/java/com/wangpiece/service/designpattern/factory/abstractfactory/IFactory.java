package com.wangpiece.service.designpattern.factory.abstractfactory;

/**
 * 场景
 */
public interface IFactory {

    IUser getUserImpl();
    IDepartment getDepartmentImpl();
}

package com.wangpiece.service.designpattern.factory.abstractfactory;


import com.wangpiece.dto.Department;

public interface IDepartment {

    void insertDepartment(Department department);
    Department getDepartment();
}

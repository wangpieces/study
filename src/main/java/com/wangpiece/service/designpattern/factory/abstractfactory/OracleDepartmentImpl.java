package com.wangpiece.service.designpattern.factory.abstractfactory;

import com.wangpiece.dto.Department;

public class OracleDepartmentImpl  implements IDepartment {
    @Override
    public void insertDepartment(Department department) {
        System.out.println("向oracle数据库插入一条department数据,操作成功!");
    }

    @Override
    public Department getDepartment() {
        System.out.println("从oracle数据库中获取一条department数据,操作成功!");
        return null;
    }
}

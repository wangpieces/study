package com.wangpiece.service.designpattern.factory.abstractfactory;

import com.wangpiece.dto.User;

public class MysqlUserImpl implements IUser{
    @Override
    public void insertUser(User user) {
        System.out.println("向mysql数据库插入一条user数据,操作成功!");
    }

    @Override
    public User getUser() {
        System.out.println("从mysql数据库中获取一条user数据,操作成功!");
        return null;
    }
}

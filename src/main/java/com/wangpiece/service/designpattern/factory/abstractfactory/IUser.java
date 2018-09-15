package com.wangpiece.service.designpattern.factory.abstractfactory;


import com.wangpiece.dto.User;

public interface IUser {

    void insertUser(User user);
    User getUser();
}

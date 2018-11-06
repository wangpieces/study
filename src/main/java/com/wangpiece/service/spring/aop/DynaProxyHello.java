package com.wangpiece.service.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-06 22:57
 */
public class DynaProxyHello implements InvocationHandler{

    private Object target;

    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;
        MyLogger.begin();
        result = method.invoke(this.target, args);
        MyLogger.end();
        return result;
    }
}

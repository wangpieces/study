package com.wangpiece.service.spring.aop;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-06 22:43
 */
public class ProxyHello implements IHello{

    private IHello iHello;

    public ProxyHello(IHello iHello) {
        this.iHello = iHello;
    }

    /**
     * sayHello method
     */
    @Override
    public void sayHello() {
        MyLogger.begin();
        iHello.sayHello();
        MyLogger.end();
    }
}

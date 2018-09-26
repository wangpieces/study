package com.wangpiece.service.designpattern.adapter.adapter;

/**
 * @desc 适配类
 * @author wang.xu
 * @date 2018-09-26 23:04
 */
public class Adapter extends Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}

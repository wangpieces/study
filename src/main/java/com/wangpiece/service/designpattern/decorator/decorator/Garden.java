package com.wangpiece.service.designpattern.decorator.decorator;

/**
 * @desc 别墅中的花园
 * @author wang.xu
 * @date 2018-09-24 23:32
 */
public class Garden extends Villa{

    @Override
    public void doDecoration() {
        super.doDecoration();
        System.out.println("装修后花园...");
    }
}

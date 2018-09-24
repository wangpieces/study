package com.wangpiece.service.designpattern.decorator.decorator;

/**
 * @desc 别墅中的游泳池
 * @author wang.xu
 * @date 2018-09-24 23:33
 */
public class SwimmingPool extends Villa {

    @Override
    public void doDecoration() {
        super.doDecoration();
        System.out.println("装修游泳池...");
    }
}

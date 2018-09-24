package com.wangpiece.service.designpattern.decorator.decorator;

/**
 * @desc 别墅：具体的房子
 * @author wang.xu
 * @date 2018-09-24 23:29
 */
public class Villa implements House{

    private House house;

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public void doDecoration() {
        if(house != null) {
            System.out.println("装修别墅...");
            house.doDecoration();
        }
    }
}

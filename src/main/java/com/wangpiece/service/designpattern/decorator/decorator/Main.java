package com.wangpiece.service.designpattern.decorator.decorator;

/**
 * @desc
 * @author wang.xu
 * @date 2018-09-24 23:35
 */
public class Main {

    public static void main(String[] args) {
        House house = new Villa();
        Villa garden = new Garden();
        Villa swimmingPool = new SwimmingPool();

        garden.setHouse(house);
        swimmingPool.setHouse(garden);
        swimmingPool.doDecoration();
    }
}

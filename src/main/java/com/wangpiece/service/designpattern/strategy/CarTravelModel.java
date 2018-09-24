package com.wangpiece.service.designpattern.strategy;

/**
 * 具体出行方式：汽车
 */
public class CarTravelModel implements TravelModel{
    @Override
    public void travel() {
        System.out.println("坐汽车...");
    }
}

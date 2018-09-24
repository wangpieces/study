package com.wangpiece.service.designpattern.strategy;

/**
 * 具体出行方式：飞机
 */
public class AircraftTravelModel implements TravelModel {

    @Override
    public void travel() {
        System.out.println("坐飞机...");
    }
}

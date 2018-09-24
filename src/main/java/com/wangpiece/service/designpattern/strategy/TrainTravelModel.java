package com.wangpiece.service.designpattern.strategy;

/**
 * 具体的出行方式：火车
 */
public class TrainTravelModel implements TravelModel {

    @Override
    public void travel() {
        System.out.println("坐火车...");
    }
}

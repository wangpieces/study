package com.wangpiece.service.designpattern.strategy.factory;

import com.wangpiece.service.designpattern.strategy.TravelModel;

/**
 * @desc 工厂方法实现
 * @author wang.xu
 * @date 2018-09-24 12:27
 */
public class Main {

    public static void main(String[] args) {
        TravelModelFactory factory = new AircraftTravelModelFactory();
        TravelModel travelModel = factory.createTravelModel();
        travelModel.travel();
    }
}

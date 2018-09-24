package com.wangpiece.service.designpattern.strategy.factory;

import com.wangpiece.service.designpattern.strategy.AircraftTravelModel;
import com.wangpiece.service.designpattern.strategy.TravelModel;

/**
 * @desc 飞机工厂
 * @author wang.xu
 * @date 2018-09-24 12:24
 */
public class AircraftTravelModelFactory implements TravelModelFactory {
    @Override
    public TravelModel createTravelModel() {
        return new AircraftTravelModel();
    }
}

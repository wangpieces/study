package com.wangpiece.service.designpattern.strategy.factory;

import com.wangpiece.service.designpattern.strategy.CarTravelModel;
import com.wangpiece.service.designpattern.strategy.TravelModel;

/**
 * 汽车工厂
 * @author wang.xu
 * @date 2018-09-24 12:24
 */
public class CarTtravelModelFactory implements TravelModelFactory{

    @Override
    public TravelModel createTravelModel() {
        return new CarTravelModel();
    }
}

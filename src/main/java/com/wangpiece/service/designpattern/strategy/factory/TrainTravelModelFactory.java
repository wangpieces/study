package com.wangpiece.service.designpattern.strategy.factory;

import com.wangpiece.service.designpattern.strategy.TrainTravelModel;
import com.wangpiece.service.designpattern.strategy.TravelModel;

/**
 * @desc 火车工厂
 * @author wang.xu
 * @date 2018-09-24 12:15
 */
public class TrainTravelModelFactory implements TravelModelFactory{
    @Override
    public TravelModel createTravelModel() {
        return new TrainTravelModel();
    }
}

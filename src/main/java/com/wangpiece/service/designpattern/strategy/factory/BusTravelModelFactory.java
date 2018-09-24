package com.wangpiece.service.designpattern.strategy.factory;

import com.wangpiece.service.designpattern.strategy.BusTravelModel;
import com.wangpiece.service.designpattern.strategy.TravelModel;

/**
 * 公交车工厂
 * @author wang.xu
 * @date 2018-09-24 12:24
 */
public class BusTravelModelFactory implements TravelModelFactory{
    @Override
    public TravelModel createTravelModel() {
        return new BusTravelModel();
    }
}

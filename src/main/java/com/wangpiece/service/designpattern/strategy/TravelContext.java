package com.wangpiece.service.designpattern.strategy;

/**
 * 具体出行方式上下文
 */
public class TravelContext {

    private TravelModel travelModel;

    public TravelContext(TravelModel travelModel) {
        this.travelModel = travelModel;
    }

    public void choiseTravel() {
        travelModel.travel();
    }
}

package com.wangpiece.service.designpattern.strategy;

/**
 * 策略模式实现
 */
public class Main {
    public static void main(String[] args) {
        TravelModel travelModel = new BusTravelModel();
        TravelContext travelContext = new TravelContext(travelModel);
        travelContext.choiseTravel();
    }
}

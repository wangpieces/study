package com.wangpiece.service.designpattern.strategy;

/**
 * 具体出行方式：坐公交
 */
public class BusTravelModel implements TravelModel{
    @Override
    public void travel() {
        System.out.println("坐公交...");
    }
}

package com.wangpiece.service.designpattern.adapter.adapter;

/**
 * @author wang.xu
 * @desc
 * @date 2018-09-26 23:06
 */
public class Main {

    public static void main(String[] args) {
        //对于客户端来说调用的就是target的request()方法
        Target target = new Adapter();
        target.request();
    }
}

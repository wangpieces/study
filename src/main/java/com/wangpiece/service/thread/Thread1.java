package com.wangpiece.service.thread;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-20 20:40
 */
public class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread1.run()");
    }
}

package com.wangpiece.service.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-27 21:33
 */
public class Main {

    public static void main(String[] args) {

        Executors.newFixedThreadPool(10);

        ThreadPoolExecutor poolExecutor =
                new ThreadPoolExecutor(10,20,10,
                        TimeUnit.DAYS, new ArrayBlockingQueue<Runnable>(10), new ThreadPoolExecutor.DiscardPolicy());

        for(int i= 0 ; i < 100;i++) {
            poolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

    }
}

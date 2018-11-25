package com.wangpiece.service.thread.mythread;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-20 20:41
 */
public class MainJoin {

    public static void main(String[] args) throws InterruptedException {

        Thread1 thread1 = new Thread1();
        Thread t1 = new Thread(thread1);
        Thread2 thread2 = new Thread2();
        Thread t2 = new Thread(thread2);
        Thread3 thread3 = new Thread3();
        Thread t3 = new Thread(thread3);
        t1.start();

        t1.join();
        t2.start();

        t2.join();
        t3.start();

    }
}

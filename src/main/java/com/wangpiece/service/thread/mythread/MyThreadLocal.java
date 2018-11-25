package com.wangpiece.service.thread.mythread;

/**
 * @author wang.xu````
 * @desc 在当前线程中有属于自己变量，并不是为了解决并发或者共享变量的问题
 * 为变量在每个线程中都创建了一个副本，那么每个线程可以访问自己内部的副本变量。
 * 最常见的ThreadLocal使用场景为 用来解决数据库连接、Session管理等
 * @date 2018-10-30 20:52
 */
public class MyThreadLocal {

    ThreadLocal<Long> longThreadLocal = new ThreadLocal<>();
    ThreadLocal<String> stringThreadLocal = new ThreadLocal<>();

    public void set() {
        longThreadLocal.set(Thread.currentThread().getId());
        stringThreadLocal.set(Thread.currentThread().getName());
    }

    public Long getLong() {
        return longThreadLocal.get();
    }

    public String getString() {
        return stringThreadLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {

        final MyThreadLocal myThreadLocal = new MyThreadLocal();
        myThreadLocal.set();
        System.out.println(myThreadLocal.getLong());
        System.out.println(myThreadLocal.getString());

        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                myThreadLocal.set();
                System.out.println(myThreadLocal.getLong());
                System.out.println(myThreadLocal.getString());
            }
        };
        thread.start();
        thread.join();
        System.out.println(myThreadLocal.getLong());
        System.out.println(myThreadLocal.getString());
    }
}

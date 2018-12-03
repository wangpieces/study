package com.wangpiece.service.thread.lock.test1;

import java.util.concurrent.locks.Condition;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-25 17:26
 */
public class Main {

    private MyLock lock = new MyLock();

    public void a() {
        lock.lock();
        System.out.println("a");
        b();
        lock.unlock();
    }
    public void b() {
        lock.lock();
        System.out.println("b");
        c();
        lock.unlock();
    }
    public void c() {
        lock.lock();
        System.out.println("c");
        lock.unlock();
    }

    public static void main(String[] args) {

        final Main main = new Main();
        new Thread(new Runnable() {
            @Override
            public void run() {
                main.a();
            }
        }).start();
    }
}

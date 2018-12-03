package com.wangpiece.service.thread.lock.test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wang.xu
 * @desc 线程按顺序执行
 * @date 2018-11-25 21:35
 */
public class Demo3 {

    private int cnt;
    private Lock lock = new ReentrantLock();
    private Condition a = lock.newCondition();
    private Condition b = lock.newCondition();
    private Condition c = lock.newCondition();

    public void a(){
        lock.lock();
        while(cnt != 0){
            try {
               a.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("a");
        cnt++;
        b.signal();
        lock.unlock();
    }
    public void b(){
        lock.lock();
        while(cnt != 1){
            try {
                b.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("b");
        cnt++;
        c.signal();
        lock.unlock();
    }
    public void c(){
        lock.lock();
        while (cnt != 2){
            try {
                c.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("c");
        cnt = 0;
        a.signal();
        lock.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        Demo3 demo = new Demo3();
        AAA a = new AAA(demo);
        BBB b = new BBB(demo);
        CCC c = new CCC(demo);

        new Thread(a).start();
        new Thread(b).start();
        new Thread(c).start();

    }


}

class AAA implements Runnable{

    private Demo3 demo;

    public AAA(Demo3 demo) {
        this.demo = demo;
    }
    @Override
    public void run() {
        demo.a();
    }
}

class BBB implements Runnable{

    private Demo3 demo;

    public BBB(Demo3 demodemo) {
        this.demo = demo;
    }
    @Override
    public void run() {
        demo.b();
    }
}

class CCC implements Runnable{

    private Demo3 demo;

    public CCC(Demo3 demo) {
        this.demo = demo;
    }
    @Override
    public void run() {
        demo.c();
    }
}

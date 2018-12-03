package com.wangpiece.service.thread.lock.test1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-25 17:17
 */
public class MyLock implements Lock{

    private boolean isLock = false;

    private Thread lockBy = null;


    private int count;

    @Override
    public synchronized void lock() {
        Thread currentThrad = Thread.currentThread();
        while(isLock && currentThrad != lockBy) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isLock = true;
        lockBy = currentThrad;
        count++;
    }

    @Override
    public synchronized void unlock() {
        Thread currentThread = Thread.currentThread();
        if(isLock && currentThread == lockBy){
            count--;
            if(count == 0){
                isLock = false;
                notifyAll();
            }
        }
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}

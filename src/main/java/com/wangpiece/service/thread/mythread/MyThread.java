package com.wangpiece.service.thread.mythread;

import java.util.Vector;
import java.util.concurrent.Callable;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-17 16:16
 */
public class MyThread{

    private volatile Integer cnt;

    public static void main(String[] args) throws InterruptedException {
        new Thread().start();
        new Object().wait();
        Vector vector = new Vector();
        vector.add("");

    }

    class Test implements Callable{

        /**
         * Computes a result, or throws an exception if unable to do so.
         *
         * @return computed result
         * @throws Exception if unable to compute a result
         */
        @Override
        public Object call() throws Exception {
            return null;
        }
    }

    class Test2 implements Runnable {

        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run() {

        }
    }
}

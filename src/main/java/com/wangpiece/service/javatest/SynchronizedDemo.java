package com.wangpiece.service.javatest;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-14 22:04
 */
public class SynchronizedDemo {

    private static Integer i = 0;
    public synchronized void method1() {
        try {
            Thread.sleep(1000 * 60 * 2);
            i++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo demo = new SynchronizedDemo();
        for (int j = 0; j < 5; j++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    demo.method1();
                }
            }).start();
        }
    }
}

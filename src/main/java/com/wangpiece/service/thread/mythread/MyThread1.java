package com.wangpiece.service.thread.mythread;

/**
 * @author wang.xu
 * @desc 多个线程顺序执行问题
 * @date 2018-11-18 16:27
 */
public class MyThread1 {


    public static void main(String[] args) {
        final Alternate alternate = new Alternate();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                alternate.printA();
            }
        },"A");

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    threadA.join();
                    alternate.printB();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B");

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    threadB.join();
                    alternate.printC();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"C");

        threadA.start();
        threadB.start();
        threadC.start();

    }


    static class Alternate{
        public void printA(){
            for (int i = 1; i <= 3 ; i++) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
        public void printB(){
            for (int i = 1; i <= 3 ; i++) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
        public void printC(){
            for (int i = 1; i <= 3 ; i++) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }


}

package com.wangpiece.service.thread.mythread;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-18 17:05
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        Producer producer = new Producer(person);
        Thread thread1 = new Thread(producer);

        Customer customer = new Customer(person);
        Thread thread2 = new Thread(customer);

        thread1.start();
        thread2.start();
    }
}

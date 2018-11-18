package com.wangpiece.service.thread;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-18 17:03
 */
public class Customer implements Runnable{

    private Person person;

    public Customer (Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            person.get();
        }
    }
}

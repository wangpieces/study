package com.wangpiece.service.thread;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-18 16:58
 */
public class Producer implements Runnable{

    private Person person;

    public Producer(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            person.set((i+1));
        }
    }
}

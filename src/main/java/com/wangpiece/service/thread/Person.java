package com.wangpiece.service.thread;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-18 16:57
 */
public class Person {

    private Object obj = new Object();
    private Boolean isEmpty = false;

    private String name;

    public void get() {
        try {
            synchronized (obj) {
                //false 表示没有数据，则等待数据被生产
                if (!isEmpty) {
                    obj.wait();
                }
                //消费数据
                System.out.println("get name is " + this.name);
                //设置为false,表示数据已经被消费
                this.isEmpty = false;
                //通知生产者生产数据
                obj.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void set(int i) {
        try {
            synchronized (obj) {
                //true 表示有数据，则等待数据被消费
                if(isEmpty) {
                    obj.wait();
                }
                //数据已经被消费，则进行生产数据
                this.name = "name" + i;
                System.out.println("set name is " + this.name);
                //将标志设置为true 表示有数据了
                this.isEmpty = true;
                // 通知消费者
                obj.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

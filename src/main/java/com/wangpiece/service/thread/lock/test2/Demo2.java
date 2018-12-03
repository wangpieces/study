package com.wangpiece.service.thread.lock.test2;

/**
 * @author wang.xu
 * @desc 线程按顺序执行
 * @date 2018-11-25 21:35
 */
public class Demo2 {

    private int cnt;

    public synchronized void a(){
        while(cnt != 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("a");
        cnt++;
        notifyAll();
    }
    public synchronized void b(){

        while(cnt != 1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("b");
        cnt++;
        notifyAll();
    }
    public synchronized void c(){

        while (cnt != 2){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("c");
        cnt = 0;
        notifyAll();
    }

    public static void main(String[] args) throws InterruptedException {
        Demo2 demo = new Demo2();
        AA a = new AA(demo);
        BB b = new BB(demo);
        CC c = new CC(demo);

       new Thread(a).start();
       new Thread(b).start();
       new Thread(c).start();

    }


}

class AA implements Runnable{

    private Demo2 demo;

    public AA(Demo2 demo) {
        this.demo = demo;
    }
    @Override
    public void run() {
        demo.a();
    }
}

class BB implements Runnable{

    private Demo2 demo;

    public BB(Demo2 demodemo) {
        this.demo = demo;
    }
    @Override
    public void run() {
        demo.b();
    }
}

class CC implements Runnable{

    private Demo2 demo;

    public CC(Demo2 demo) {
        this.demo = demo;
    }
    @Override
    public void run() {
        demo.c();
    }
}

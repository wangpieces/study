package com.wangpiece.service.thread.lock.test2;

/**
 * @author wang.xu
 * @desc 线程按顺序执行
 * @date 2018-11-25 21:35
 */
public class Demo1 {

    public void a(){
        System.out.println("a");
    }
    public void b(){
        System.out.println("b");
    }
    public void c(){
        System.out.println("c");
    }

    public static void main(String[] args) throws InterruptedException {
        Demo1 demo1 = new Demo1();
        A a = new A(demo1);
        B b = new B(demo1);
        C c = new C(demo1);

        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);
        Thread threadC = new Thread(c);

        threadA.start();
        threadA.join();
        threadB.start();
        threadB.join();
        threadC.start();
    }


}

class A implements Runnable{

    private Demo1 demo1;

    public A(Demo1 demo1) {
        this.demo1 = demo1;
    }
    @Override
    public void run() {
        demo1.a();
    }
}
class B implements Runnable{

    private Demo1 demo1;

    public B(Demo1 demo1) {
        this.demo1 = demo1;
    }
    @Override
    public void run() {
        demo1.b();
    }
}
class C implements Runnable{

    private Demo1 demo1;

    public C(Demo1 demo1) {
        this.demo1 = demo1;
    }
    @Override
    public void run() {
        demo1.c();
    }
}

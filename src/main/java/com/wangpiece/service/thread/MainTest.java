package com.wangpiece.service.thread;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-20 21:32
 */
public class MainTest {

    public MainTest() {
        System.out.println("MainTest");
    }

    static {
        System.out.println("A");
    }

    {
        System.out.println("B");
    }

    static {
        System.out.println("C");
    }
    public MainTest(String name) {
        System.out.println("MainTest(name)");
        System.out.println(name);
    }

}

class Child extends MainTest {

    MainTest mainTest;

    public Child(){
        System.out.println("Child");
    }
    public Child(String name){
        System.out.println(name);
        test();
        mainTest = new MainTest("MainTest.test");
    }

    {
        System.out.println("D");
    }

    public void test() {
        System.out.println("test()");
    }

    public static void main(String[] args) {
        new Child("Child.test");
    }
}

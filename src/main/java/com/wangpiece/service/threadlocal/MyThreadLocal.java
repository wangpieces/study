package com.wangpiece.service.threadlocal;

/**
 * @author wang.xu````
 * @desc 在当前线程中有属于自己变量，并不是为了解决并发或者共享变量的问题
 * @date 2018-10-30 20:52
 */
public class MyThreadLocal {

    public static void main(String[] args) {

        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("test");
        threadLocal.set("test1");
        String s = threadLocal.get();
        threadLocal.remove();
        System.out.println(s);

    }
}

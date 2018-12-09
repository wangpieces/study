package com.wangpiece.service.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wang.xu
 * @desc
 * @date 2018-12-03 23:40
 */
public class Main {

    public static void main(String[] args) {
        int a = 1;//基本数据类型
        String s1 = "abc";//引用类型,该值存放在运行时常量池
        String s2 = "abc";//引用类型,该值存放在运行时常量池

        System.out.println(s1 == s2); //true
        String s3 = new String("abc");//在堆中实例化对象，该值存放在堆中
        System.out.println(s1 == s3); //false
    }
}

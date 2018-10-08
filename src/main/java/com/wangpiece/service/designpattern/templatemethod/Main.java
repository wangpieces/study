package com.wangpiece.service.designpattern.templatemethod;

/**
 * @desc 模板方法模式,定义一个步骤中的算法骨架，而将一些步骤的实现延迟到子类中，模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
 * @author wang.xu
 * @date 2018-10-08 22:28
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Student1:");
        TestPaper testPaper = new Student1();
        testPaper.question1();
        testPaper.question2();
        testPaper.question3();

        System.out.println("Student2:");
        testPaper = new Student2();
        testPaper.question1();
        testPaper.question2();
        testPaper.question3();
    }
}

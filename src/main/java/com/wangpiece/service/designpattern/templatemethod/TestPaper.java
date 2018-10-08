package com.wangpiece.service.designpattern.templatemethod;

/**
 * @desc
 * @author wang.xu
 * @date 2018-10-08 22:34
 */
public abstract class TestPaper {

    public void question1() {
        System.out.println("question1: Are you ok?");
        System.out.println("A：a B:b C:c D:d");
        System.out.println("Your answer is:" + answer1());
    }

    public void question2() {
        System.out.println("question1: Are you ok??");
        System.out.println("A：a B:b C:c D:d");
        System.out.println("Your answer is:" + answer2());
    }

    public void question3() {
        System.out.println("question1: Are you ok???");
        System.out.println("A：a B:b C:c D:d");
        System.out.println("Your answer is:" + answer3());
    }

    public abstract String answer1();
    public abstract String answer2();
    public abstract String answer3();
}

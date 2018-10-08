package com.wangpiece.service.designpattern.templatemethod;

/**
 * @author wang.xu
 * @desc
 * @date 2018-10-08 22:42
 */
public class Student1 extends TestPaper{

    @Override
    public String answer1() {
        return "A";
    }

    @Override
    public String answer2() {
        return "B";
    }

    @Override
    public String answer3() {
        return "C";
    }
}

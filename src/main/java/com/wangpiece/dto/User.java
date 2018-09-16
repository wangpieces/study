package com.wangpiece.dto;

public class User extends BaseDto{

    public String abcStr;
    public static String abcStaticStr;
    public static final String abcStaticFinalStr = "";

    private String name = "wangpiece";
    private Integer age;
    private String sex;

    public User() {
        System.out.println("User()无参构造函数执行...");
    }

    public User(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("User()有参构造函数执行...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}

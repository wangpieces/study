package com.wangpiece.service.enums;

import com.wangpiece.enums.CommonEnum;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        try {
            Class cls = Class.forName("com.wangpiece.enums.CommonEnum");
            Method values = cls.getMethod("values");
            CommonEnum invoke = (CommonEnum) values.invoke(CommonEnum.class);
            System.out.println(invoke.getType());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

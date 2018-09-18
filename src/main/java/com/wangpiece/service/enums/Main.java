package com.wangpiece.service.enums;

import com.wangpiece.utils.enums.EnumUtil;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> enumValues = EnumUtil.getEnumValues("com.wangpiece.enums.CommonEnum");
//        Map<Integer, String> enumValues = EnumUtil.getEnumValues(CommonEnum.class);
        System.out.println(enumValues);
    }
}

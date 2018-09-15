package com.wangpiece.utils.number;

public class NumberUtil {

    public static Boolean isEmpty(Number number) {
        return number == null;
    }

    public static Boolean isNotEmpty(Number number) {
        return !isEmpty(number);
    }
}

package com.wangpiece.utils.number;

public class NumberUtil {

    public static Boolean isEmpty(Number number) {
        return number == null;
    }

    public static Boolean isNotEmpty(Number number) {
        return !isEmpty(number);
    }

    public static Boolean isZero(Number number) {
        return number.equals(0);
    }

    public static Boolean isMoreLhanZero(Number number) {
        return number.doubleValue() > 0;
    }

    public static Boolean isLessLhanZero(Number number) {
        return number.doubleValue() < 0;
    }
}

package com.wangpiece.service.designpattern.factory;

import com.wangpiece.utils.number.NumberUtil;

public class OperationSub implements IOperation{

    @Override
    public Number getResult(Number number1, Number number2) {
        if(NumberUtil.isEmpty(number1) || NumberUtil.isEmpty(number2)){
            throw new RuntimeException("参数不对");
        }
        return number1.doubleValue() - number2.doubleValue();
    }
}

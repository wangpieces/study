package com.wangpiece.utils.enums;

import com.wangpiece.enums.BaseEnum;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class EnumUtil{

    /**
     * 获取枚举类型信息通用方法
     * @param className
     * @return
     */
    public static Map<Integer, String> getEnumValues(String className){

        Map<Integer, String> resultMap = new HashMap<>();
        try {
            Class cls = Class.forName(className);
            Method valuse = cls.getMethod("values");
            BaseEnum[] baseEnums = (BaseEnum[]) valuse.invoke(cls);
            for(BaseEnum baseEnum : baseEnums) {
                resultMap.put(baseEnum.getType(),baseEnum.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return resultMap;
    }
}

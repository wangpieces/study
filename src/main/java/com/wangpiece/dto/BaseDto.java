package com.wangpiece.dto;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class BaseDto {

    @Override
    public String toString() {

        Field[] fields = this.getClass().getDeclaredFields();
        StringBuffer sb = new StringBuffer(this.getClass().getSimpleName()).append("{");
        for(Field field : fields) {
            String name = field.getName();
            if(Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
                sb.append(name).append("=");
                Object value = "";
                try {
                    value = field.get(this);
                    sb.append(value);
                } catch (IllegalAccessException e) {
                    sb.append("");
                    e.printStackTrace();
                }
                sb.append(", ");
            }
        }
        sb.append("}");

        return sb.toString();
    }
}

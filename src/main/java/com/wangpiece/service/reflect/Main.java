package com.wangpiece.service.reflect;

import com.wangpiece.dto.User;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) {

        try {
            Class cls = Class.forName("com.wangpiece.dto.User");
            System.out.println("获取所有方法");
            Method[] methods = cls.getMethods();
            for (Method method : methods) {
                String methodName = method.getName();
                System.out.println(methodName);
            }
            System.out.println("获取所有public字段");
            Field[] fields = cls.getFields();
            for (Field field: fields) {
                System.out.println(field.getName());
            }
            System.out.println("获取所有字段");
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field: declaredFields) {
                System.out.println(field.getName());
            }
            System.out.println("获取所有构造方法");
            Constructor[] constructors = cls.getConstructors();
            for (Constructor constructor : constructors) {
                System.out.println(constructor.getName());
                Parameter[] parameters = constructor.getParameters();
                for (Parameter parameter : parameters) {
                    System.out.println(parameter);
                }
            }
            System.out.println("获取所有的类");
            Class[] classes = cls.getClasses();
            for (Class cl : classes) {
                System.out.println(cl.getName());
            }
            System.out.println("通过反射调用方法");
            //方法一
            User user = (User)cls.newInstance();
            System.out.println(user.getName());
            //方法二，无参数
            Method getName = cls.getMethod("getName");
            Object invoke = getName.invoke(user);
            System.out.println(invoke);
            //方法二，有参数
            Method setName = cls.getMethod("setName", String.class);
            setName.invoke(user, "wangpiece1");
            invoke = getName.invoke(user);
            System.out.println(invoke);

            System.out.println("通过反射调用构造函数");
            User user1 = (User) cls.getConstructor().newInstance();
            System.out.println(user1.getName());
            User user2 = (User) cls.getConstructor(String.class, Integer.class, String.class).newInstance("wang", 18, "男");
            System.out.println(user2.getName());
            System.out.println("重新toString()");
            System.out.println(user2.toString());


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}

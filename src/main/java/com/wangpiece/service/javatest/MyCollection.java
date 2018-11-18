package com.wangpiece.service.javatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-11 17:29
 */
public class MyCollection {

    public static void main(String[] args) {
        new HashMap<String,String>().put("test","abc");
        new HashMap<String,String>().get("");
//        Collections.synchronizedMap(null);
        new ConcurrentHashMap<>().put("","");
        new ConcurrentHashMap<>().size();


        new ArrayList().add("");
        new LinkedList<>().add("");
    }
}

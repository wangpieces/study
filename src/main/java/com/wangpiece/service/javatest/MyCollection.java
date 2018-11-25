package com.wangpiece.service.javatest;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wang.xu
 * @desc
 * @date 2018-11-11 17:29
 */
public class MyCollection {

    public static void main(String[] args) {
        new HashMap<String,String>().put(null,null);
        new HashMap<String,String>().get("");
//        Collections.synchronizedMap(null);
        new ConcurrentHashMap<>().put("","");
        new ConcurrentHashMap<>().size();
        new Hashtable<>().put("","");


        new ArrayList().add("");
//        new ArrayList().get(1);
        new LinkedList<>().add("");
    }
}

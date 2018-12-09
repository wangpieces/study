package com.wangpiece.service.jvm;

/**
 * @author wang.xu
 * @desc
 * @date 2018-12-09 17:05
 */
public class TestGC {
    public Object instance = null;

    public static void testGC(){
        TestGC testGCA = new TestGC();
        TestGC testGCB = new TestGC();
        testGCA.instance = testGCB;
        testGCB.instance = testGCA;

        testGCA = null;
        testGCB = null;

        System.gc();
    }
}

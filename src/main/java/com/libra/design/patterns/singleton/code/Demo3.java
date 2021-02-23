package com.libra.design.patterns.singleton.code;


/**
 * 懒汉式
 **/
public class Demo3 {

    private static class Demo3Holder {
        private static final Demo3 INSTANCE = new Demo3();
    }

    private Demo3() {};

    public static Demo3 getInstance(){
        return Demo3Holder.INSTANCE;
    }

}

package com.libra.design.patterns.singleton.code;


/**
 * 懒汉式
 **/
public class Demo2 {
    private static Demo2 INSTANCE;

    private static final Object lock = new Object();

    private Demo2() {};

    public static Demo2 getInstance(){
        if (INSTANCE == null){
            synchronized (lock) {
                if (INSTANCE == null) {
                    INSTANCE = new Demo2();
                }
            }
        }
        return INSTANCE;
    }

}

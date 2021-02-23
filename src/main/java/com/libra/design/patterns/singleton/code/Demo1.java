package com.libra.design.patterns.singleton.code;


/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 * （话说你不用，你装在他干嘛）
 **/
public class Demo1 {
    private static final Demo1 INSTANCE = new Demo1();

    private Demo1() {};

    public static Demo1 getInstance(){return INSTANCE;}

}

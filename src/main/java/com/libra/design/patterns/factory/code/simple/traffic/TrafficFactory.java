package com.libra.design.patterns.factory.code.simple.traffic;

public class TrafficFactory {
    public static Traffic create(Class type) throws Exception{
        Object result = type.newInstance();
        // 根据TYPE创建实体
        if (result instanceof Traffic) {
            return (Traffic)result;
        }else {
            throw new RuntimeException("传入类未继承Traffic父类，无法通过工厂构建");
        }
    }
}

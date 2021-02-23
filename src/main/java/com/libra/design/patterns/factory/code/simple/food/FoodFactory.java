package com.libra.design.patterns.factory.code.simple.food;

public class FoodFactory {
    public static Food create(Class type) throws Exception{
        Object result = type.newInstance();
        // 根据TYPE创建实体
        if (result instanceof Food) {
            return (Food)result;
        }else {
            throw new RuntimeException("传入类未继承Food父类，无法通过工厂构建");
        }
    }
}

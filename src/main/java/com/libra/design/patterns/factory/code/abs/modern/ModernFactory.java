package com.libra.design.patterns.factory.code.abs.modern;

import com.libra.design.patterns.factory.code.abs.AbstarctFood;
import com.libra.design.patterns.factory.code.abs.AbstarctTraffic;
import com.libra.design.patterns.factory.code.abs.AbstractFactory;
import com.libra.design.patterns.factory.code.abs.modern.food.ModernFood;
import com.libra.design.patterns.factory.code.abs.modern.traffic.ModernTraffic;

public class ModernFactory extends AbstractFactory {

    @Override
    public AbstarctFood creatFood(Class type) throws Exception {
        Object result = type.newInstance();
        // 根据TYPE创建实体
        if (result instanceof ModernFood) {
            return (AbstarctFood)result;
        }else {
            throw new RuntimeException("传入类未继承ModernFood父类，无法通过工厂构建");
        }
    }

    @Override
    public  AbstarctTraffic creatTraffic(Class type) throws Exception {
        Object result = type.newInstance();
        // 根据TYPE创建实体
        if (result instanceof ModernTraffic) {
            return (AbstarctTraffic)result;
        }else {
            throw new RuntimeException("传入类未继承ModernTraffic父类，无法通过工厂构建");
        }
    }
}

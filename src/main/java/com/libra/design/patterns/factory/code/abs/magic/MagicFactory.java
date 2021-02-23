package com.libra.design.patterns.factory.code.abs.magic;

import com.libra.design.patterns.factory.code.abs.AbstarctFood;
import com.libra.design.patterns.factory.code.abs.AbstarctTraffic;
import com.libra.design.patterns.factory.code.abs.AbstractFactory;
import com.libra.design.patterns.factory.code.abs.magic.food.MagicFood;
import com.libra.design.patterns.factory.code.abs.magic.traffic.MagicTraffic;

public class MagicFactory extends AbstractFactory {

    @Override
    public AbstarctFood creatFood(Class type) throws Exception {
        Object result = type.newInstance();
        // 根据TYPE创建实体
        if (result instanceof MagicFood) {
            return (AbstarctFood)result;
        }else {
            throw new RuntimeException("传入类未继承ModernFood父类，无法通过工厂构建");
        }
    }

    @Override
    public AbstarctTraffic creatTraffic(Class type) throws Exception {
        Object result = type.newInstance();
        // 根据TYPE创建实体
        if (result instanceof MagicTraffic) {
            return (AbstarctTraffic)result;
        }else {
            throw new RuntimeException("传入类未继承MagicTraffic父类，无法通过工厂构建");
        }
    }
}

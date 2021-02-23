package com.libra.design.patterns.flyweight.code;

import com.libra.design.patterns.flyweight.code.impl.ConcreteFlyweight;
import com.libra.design.patterns.flyweight.code.impl.UnsharedConcreteFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 元工厂
 *
 * @author sx
 * @date 2021-02-22
 */
public class FlyweightFactory {

    private static Map<Integer, Flyweight> flyweights = new HashMap();

    static  {
        flyweights.put(1,new ConcreteFlyweight());
        flyweights.put(2,new ConcreteFlyweight());
        flyweights.put(3,new ConcreteFlyweight());
        flyweights.put(4,new ConcreteFlyweight());
    }

    public static Flyweight getConcretes(Integer key){
        return flyweights.get(key);
    }

    public static Flyweight creatUnsharedConcrete(){
        return new UnsharedConcreteFlyweight();
    }
}

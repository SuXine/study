package com.libra.design.patterns.factory.code.abs;

public abstract class AbstractFactory {

    public abstract AbstarctFood creatFood(Class type) throws Exception ;

    public abstract AbstarctTraffic creatTraffic(Class type) throws Exception ;

}

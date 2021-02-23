package com.libra.design.patterns.factory.code.abs;

import com.libra.design.patterns.factory.code.abs.modern.ModernFactory;
import com.libra.design.patterns.factory.code.abs.modern.food.Bread;
import com.libra.design.patterns.factory.code.abs.modern.traffic.Car;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractFactory factory = new ModernFactory();
        AbstarctFood food = factory.creatFood(Bread.class);
        AbstarctTraffic traffic = factory.creatTraffic(Car.class);
        food.printName();
        traffic.go();
    }
}

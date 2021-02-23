package com.libra.design.patterns.factory.code.simple;

import com.libra.design.patterns.factory.code.simple.food.Food;
import com.libra.design.patterns.factory.code.simple.food.FoodFactory;
import com.libra.design.patterns.factory.code.simple.food.Ham;
import com.libra.design.patterns.factory.code.simple.traffic.Plane;
import com.libra.design.patterns.factory.code.simple.traffic.Traffic;
import com.libra.design.patterns.factory.code.simple.traffic.TrafficFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        Traffic traffic = TrafficFactory.create(Plane.class);
        Food food = FoodFactory.create(Ham.class);
        traffic.go();
        food.printName();
    }
}

package com.libra.design.patterns.strategy.demo.count.impl;

import com.libra.design.patterns.strategy.demo.count.Count;

public class DiscountCount implements Count {


    @Override
    public Double count(Double total, Double discount, Double num2) {
        System.out.println("使用【折扣】策略");
        return total.doubleValue() * discount.doubleValue();
    }
}

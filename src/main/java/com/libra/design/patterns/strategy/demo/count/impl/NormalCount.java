package com.libra.design.patterns.strategy.demo.count.impl;

import com.libra.design.patterns.strategy.demo.count.Count;

public class NormalCount implements Count {
    @Override
    public Double count(Double total, Double num1, Double num2) {
        System.out.println("使用【正常收费】策略");
        return total.doubleValue();
    }
}

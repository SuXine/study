package com.libra.design.patterns.strategy.demo.count.impl;

import com.libra.design.patterns.strategy.demo.count.Count;

public class FullReductionCount implements Count {
    @Override
    public Double count(Double total, Double fullAmount, Double subAmount) {
        System.out.println("使用【满减】策略");
        return total - (total / fullAmount) * subAmount;
    }
}

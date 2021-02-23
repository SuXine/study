package com.libra.design.patterns.strategy.demo;

import com.libra.design.patterns.strategy.demo.count.impl.DiscountCount;
import com.libra.design.patterns.strategy.demo.count.impl.FullReductionCount;
import com.libra.design.patterns.strategy.demo.count.impl.NormalCount;

public class StrategyMain {
    public static void main(String[] args) {
        System.out.println(new Context(new NormalCount()).count(100d,0d,0d));
        System.out.println(new Context(new FullReductionCount()).count(100d,10d,5d));
        System.out.println(new Context(new DiscountCount()).count(100d,0.8d,0d));
    }
}

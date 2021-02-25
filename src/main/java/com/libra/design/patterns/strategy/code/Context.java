package com.libra.design.patterns.strategy.code;

import com.libra.design.patterns.strategy.code.strategy.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}

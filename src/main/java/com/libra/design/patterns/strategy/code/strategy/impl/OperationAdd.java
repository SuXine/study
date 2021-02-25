package com.libra.design.patterns.strategy.code.strategy.impl;

import com.libra.design.patterns.strategy.code.strategy.Strategy;

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

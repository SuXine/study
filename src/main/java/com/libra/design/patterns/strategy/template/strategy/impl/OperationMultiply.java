package com.libra.design.patterns.strategy.template.strategy.impl;

import com.libra.design.patterns.strategy.template.strategy.Strategy;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

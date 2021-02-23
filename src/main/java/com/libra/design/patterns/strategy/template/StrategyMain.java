package com.libra.design.patterns.strategy.template;

import com.libra.design.patterns.strategy.template.strategy.impl.OperationAdd;
import com.libra.design.patterns.strategy.template.strategy.impl.OperationMultiply;
import com.libra.design.patterns.strategy.template.strategy.impl.OperationSubtract;

public class StrategyMain {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}

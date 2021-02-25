package com.libra.design.patterns.strategy.code;

import com.libra.design.patterns.strategy.code.strategy.impl.OperationAdd;
import com.libra.design.patterns.strategy.code.strategy.impl.OperationMultiply;
import com.libra.design.patterns.strategy.code.strategy.impl.OperationSubtract;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}

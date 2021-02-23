package com.libra.design.patterns.decorator.code.modification;

import com.libra.design.patterns.decorator.code.AbsModification;
import com.libra.design.patterns.decorator.code.ModificationOperation;

public class ModificationA extends AbsModification {

    // 修饰器 可以对 修饰器 进行修饰
    private ModificationOperation operation;

    public ModificationA(ModificationOperation operation) {
        this.operation = operation;
    }

    @Override
    public void Operation() {
        System.out.println("我是修饰器A - 我将先执行我自己的操作 再执行接下来的操作");
        operation.Operation();
    }
}

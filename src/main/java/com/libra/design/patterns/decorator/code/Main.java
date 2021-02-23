package com.libra.design.patterns.decorator.code;

import com.libra.design.patterns.decorator.code.AbsByModification;
import com.libra.design.patterns.decorator.code.AbsModification;
import com.libra.design.patterns.decorator.code.bymodification.ByModificationA;
import com.libra.design.patterns.decorator.code.modification.ModificationA;
import com.libra.design.patterns.decorator.code.modification.ModificationB;
import com.libra.design.patterns.decorator.code.modification.ModificationC;

public class Main {
    public static void main(String[] args) {
        AbsByModification byModification = new ByModificationA();
        // 对最终对象进行A修饰
        AbsModification modification_after_a = new ModificationA(byModification);
        // 对A修饰完的对象进行B修饰
        AbsModification modification_after_b = new ModificationB(modification_after_a);
        // 对A修饰完的对象进行C修饰
        AbsModification modification_after_c = new ModificationC(modification_after_b);

        modification_after_c.Operation();
    }
}

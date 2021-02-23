package com.libra.design.patterns.visitor.demo.status;


import com.libra.design.patterns.visitor.demo.person.Man;
import com.libra.design.patterns.visitor.demo.person.Woman;

public class FailureStatus extends Status {

    private final static String name = "失败";

    public void manIn(Man man) {
        System.out.println(man.getType() + name + "时，闷头喝酒，谁也不用劝。");
    }

    public void womanIn(Woman woman) {
        System.out.println(woman.getType() + name + "时，眼泪汪汪，谁也劝不动。");
    }
}

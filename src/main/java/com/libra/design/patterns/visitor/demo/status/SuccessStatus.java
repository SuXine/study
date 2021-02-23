package com.libra.design.patterns.visitor.demo.status;


import com.libra.design.patterns.visitor.demo.person.Man;
import com.libra.design.patterns.visitor.demo.person.Woman;

public class SuccessStatus extends Status {

    private final static String name = "成功";

    public void manIn(Man man) {
        System.out.println(man.getType() + name + "时，背后多半有一个伟大的女人。");
    }

    public void womanIn(Woman woman) {
        System.out.println(woman.getType() + name + "时，背后大多有一个不成功的男人。");
    }
}

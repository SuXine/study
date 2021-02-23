package com.libra.design.patterns.visitor.demo.status;


import com.libra.design.patterns.visitor.demo.person.Man;
import com.libra.design.patterns.visitor.demo.person.Woman;

public abstract class Status {
    public abstract void manIn(Man man);
    public abstract void womanIn(Woman woman);
}

package com.libra.design.patterns.visitor.demo.person;

import com.libra.design.patterns.visitor.demo.status.Status;

public abstract class Person {

    public final String type;
    public Person(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public abstract void in(Status visitor);



}

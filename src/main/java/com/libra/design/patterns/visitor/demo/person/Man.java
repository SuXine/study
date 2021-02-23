package com.libra.design.patterns.visitor.demo.person;

import com.libra.design.patterns.visitor.demo.status.Status;

public class Man extends Person {

    public Man() {
        super("男人");
    }

    public void in(Status status) {
        status.manIn(this);
    }
}

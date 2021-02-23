package com.libra.design.patterns.visitor.demo.person;

import com.libra.design.patterns.visitor.demo.status.Status;

public class Woman extends Person {

    public Woman() {
        super("女人");
    }

    public void in(Status status) {
        status.womanIn(this);
    }
}

package com.libra.design.patterns.visitor.template.element;

import com.libra.design.patterns.visitor.template.visitor.Visitor;

public abstract class Element {

    public final String name;

    public abstract void accept(Visitor visitor);

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

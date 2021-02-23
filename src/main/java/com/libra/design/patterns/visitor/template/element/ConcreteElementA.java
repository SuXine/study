package com.libra.design.patterns.visitor.template.element;

import com.libra.design.patterns.visitor.template.visitor.Visitor;

public class ConcreteElementA extends Element {

    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public ConcreteElementA(String name) {
        super(name);
    }

}

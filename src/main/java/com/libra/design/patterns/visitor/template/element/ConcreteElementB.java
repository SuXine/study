package com.libra.design.patterns.visitor.template.element;

import com.libra.design.patterns.visitor.template.visitor.Visitor;

public class ConcreteElementB extends Element{

    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public ConcreteElementB(String name) {
        super(name);
    }

}

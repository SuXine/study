package com.libra.design.patterns.visitor.template.visitor;

import com.libra.design.patterns.visitor.template.element.ConcreteElementA;
import com.libra.design.patterns.visitor.template.element.ConcreteElementB;

public abstract class Visitor {
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementA);
}

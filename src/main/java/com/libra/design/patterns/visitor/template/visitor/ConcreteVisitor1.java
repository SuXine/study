package com.libra.design.patterns.visitor.template.visitor;

import com.libra.design.patterns.visitor.template.element.ConcreteElementA;
import com.libra.design.patterns.visitor.template.element.ConcreteElementB;

public class ConcreteVisitor1 extends Visitor {
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("ConcreteVisitor1 访问了 " + concreteElementA.getName());
    }

    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("ConcreteVisitor1 访问了 " + concreteElementB.getName());
    }
}

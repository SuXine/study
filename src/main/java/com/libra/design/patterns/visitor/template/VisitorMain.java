package com.libra.design.patterns.visitor.template;

import com.libra.design.patterns.visitor.template.element.ConcreteElementA;
import com.libra.design.patterns.visitor.template.element.ConcreteElementB;
import com.libra.design.patterns.visitor.template.visitor.ConcreteVisitor1;
import com.libra.design.patterns.visitor.template.visitor.ConcreteVisitor2;

/**
 * @Description: 访问者模式DEMO
 * @Author: sx
 * @Date: 2020/9/21 10:23
 **/
public class VisitorMain {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreteElementA("demoA"));
        o.attach(new ConcreteElementB("demoB"));

        ConcreteVisitor1 v1 = new ConcreteVisitor1();
        ConcreteVisitor2 v2 = new ConcreteVisitor2();

        o.accept(v1);
        o.accept(v2);
    }
}

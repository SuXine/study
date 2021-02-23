package com.libra.design.patterns.visitor.demo;

import com.libra.design.patterns.visitor.demo.person.Man;
import com.libra.design.patterns.visitor.demo.person.Woman;
import com.libra.design.patterns.visitor.demo.status.FailureStatus;
import com.libra.design.patterns.visitor.demo.status.SuccessStatus;

/**
 * @Description: 访问者模式DEMO
 * @Author: sx
 * @Date: 2020/9/21 10:23
 **/
public class VisitorMain {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        SuccessStatus successStatus = new SuccessStatus();
        FailureStatus failureStatus = new FailureStatus();

        o.in(successStatus);
        o.in(failureStatus);

    }
}

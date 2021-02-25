package com.libra.design.patterns.template.code;

/**
 * Description: 父类
 *
 * @author sx
 * @date 2021-02-24
 */
public abstract class Parent {
    public void templateMethod(){
        op1();
        op2();
    }

    abstract void op1();

    abstract void op2();
}

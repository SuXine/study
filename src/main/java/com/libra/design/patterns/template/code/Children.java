package com.libra.design.patterns.template.code;

/**
 * Description: 父类
 *
 * @author sx
 * @date 2021-02-24
 */
public class Children  extends Parent{
    @Override
    void op1() {
        System.out.println("子类的op1方法");
    }

    @Override
    void op2() {
        System.out.println("子类的op2方法");
    }
}

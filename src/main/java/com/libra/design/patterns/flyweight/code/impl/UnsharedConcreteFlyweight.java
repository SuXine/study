package com.libra.design.patterns.flyweight.code.impl;

import com.libra.design.patterns.flyweight.code.Flyweight;

/**
 * Description: 不共享的元
 *
 * @author sx
 * @date 2021-02-22
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    @Override
    public void operation(Integer extrinsicstate) {
        System.out.println("不共享的元：" + extrinsicstate);
    }
}

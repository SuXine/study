package com.libra.design.patterns.flyweight.code.impl;

import com.libra.design.patterns.flyweight.code.Flyweight;

/**
 * Description: 共享的元
 *
 * @author sx
 * @date 2021-02-22
 */
public class ConcreteFlyweight implements Flyweight {

    @Override
    public void operation(Integer extrinsicstate) {
        System.out.println("共享的元：" + extrinsicstate);
    }
}

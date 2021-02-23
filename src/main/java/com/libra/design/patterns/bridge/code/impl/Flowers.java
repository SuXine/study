package com.libra.design.patterns.bridge.code.impl;

import com.libra.design.patterns.bridge.code.GiftSpecies;

/**
 * Description: 花
 *
 * @author sx
 * @date 2021-02-04
 */
public class Flowers extends GiftSpecies {
    @Override
    public void print() {
        System.out.println("我是一个花");
    }
}

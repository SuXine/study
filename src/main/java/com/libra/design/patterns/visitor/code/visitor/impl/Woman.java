package com.libra.design.patterns.visitor.code.visitor.impl;

import com.libra.design.patterns.visitor.code.goods.Goods;
import com.libra.design.patterns.visitor.code.visitor.Visitor;

/**
 * Description: 女人
 *
 * @author sx
 * @date 2021-02-03
 */
public class Woman implements Visitor {
    @Override
    public Double bug(Goods goods) {
        System.out.println("女人购买商品将打5折");
        return goods.getPrice()*0.5;
    }
}

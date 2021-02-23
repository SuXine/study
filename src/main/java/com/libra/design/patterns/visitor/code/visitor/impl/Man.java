package com.libra.design.patterns.visitor.code.visitor.impl;

import com.libra.design.patterns.visitor.code.goods.Goods;
import com.libra.design.patterns.visitor.code.visitor.Visitor;

/**
 * Description: 男人
 *
 * @author sx
 * @date 2021-02-03
 */
public class Man implements Visitor {
    @Override
    public Double bug(Goods goods) {
        System.out.println("男人购买商品将打8折");
        return goods.getPrice()*0.8;
    }
}

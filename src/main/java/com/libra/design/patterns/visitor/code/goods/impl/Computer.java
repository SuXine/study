package com.libra.design.patterns.visitor.code.goods.impl;

import com.libra.design.patterns.visitor.code.goods.Goods;
import com.libra.design.patterns.visitor.code.visitor.Visitor;

/**
 * Description: 电脑类
 *
 * @author sx
 * @date 2021-02-03
 */
public class Computer implements Goods {
    @Override
    public Double discount(Visitor visitor) {
        return visitor.bug(this);
    }

    @Override
    public Double getPrice() {
        return 2000d;
    }
}

package com.libra.design.patterns.visitor.code.goods;

import com.libra.design.patterns.visitor.code.visitor.Visitor;

public interface Goods {

    Double discount(Visitor visitor);

    Double getPrice();

}

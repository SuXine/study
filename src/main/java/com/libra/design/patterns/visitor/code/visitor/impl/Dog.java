package com.libra.design.patterns.visitor.code.visitor.impl;

import com.libra.design.patterns.visitor.code.goods.Goods;
import com.libra.design.patterns.visitor.code.visitor.Visitor;

/**
 * Description: 狗
 *
 * @author sx
 * @date 2021-02-03
 */
public class Dog implements Visitor {
    @Override
    public Double bug(Goods goods) {
        System.out.println("狗买所有用品免费");
        return 0d;
    }
}

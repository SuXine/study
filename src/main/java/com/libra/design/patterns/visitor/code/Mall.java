package com.libra.design.patterns.visitor.code;

import com.libra.design.patterns.visitor.code.goods.Goods;
import com.libra.design.patterns.visitor.code.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 商城类
 *
 * @author sx
 * @date 2021-02-03
 */
public class Mall {
    List<Goods> goodList = new ArrayList<>();

    public void addGoods(Goods goods) {
        this.goodList.add(goods);
    }

    public void removeGoods(Goods goods) {
        this.goodList.remove(goods);
    }

    public void visitor(Visitor visitor) {
        if (goodList.isEmpty()) {
            throw new RuntimeException("不好意思 商品已卖完");
        }
        goodList.forEach(item -> {
            Double discount = item.discount(visitor);
            System.out.println("您购买的价格为：" + discount);
        });
    }
}

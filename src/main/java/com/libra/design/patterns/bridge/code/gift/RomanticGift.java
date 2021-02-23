package com.libra.design.patterns.bridge.code.gift;

import com.libra.design.patterns.bridge.code.GiftSpecies;
import com.libra.design.patterns.bridge.code.GiftType;

/**
 * Description: 浪漫的礼物
 *
 * @author sx
 * @date 2021-02-04
 */
public class RomanticGift extends GiftType {

    public RomanticGift(GiftSpecies gift) {
        super(gift);
    }

    @Override
    public void print() {
        getGift().print();
        System.out.println("我是冷酷的礼物");
    }
}

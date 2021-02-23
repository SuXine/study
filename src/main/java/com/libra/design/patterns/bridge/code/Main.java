package com.libra.design.patterns.bridge.code;

import com.libra.design.patterns.bridge.code.gift.ColdGift;
import com.libra.design.patterns.bridge.code.impl.Flowers;

/**
 * Description: 主类
 *
 * @author sx
 * @date 2021-02-04
 */
public class Main {
    public static void main(String[] args) {
        ColdGift gift = new ColdGift(new Flowers()) {};

        gift.print();
    }
}

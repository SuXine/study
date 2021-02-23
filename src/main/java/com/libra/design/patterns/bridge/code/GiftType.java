package com.libra.design.patterns.bridge.code;

/**
 * Description: 礼物抽象类
 *
 * @author sx
 * @date 2021-02-04
 */
public abstract class GiftType {
    private GiftSpecies gift;

    public GiftSpecies getGift() {
        return gift;
    }

    public void setGift(GiftSpecies gift) {
        this.gift = gift;
    }

    public GiftType(GiftSpecies gift) {
        this.gift = gift;
    }

    public void print() {
        getGift().print();
    }
}

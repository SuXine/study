package com.libra.design.patterns.prototype.code;

/**
 * Description: 深克隆类
 *
 * @author sx
 * @date 2021-02-23
 */
public class DeepPrototype implements Cloneable{
    private String a;
    private Internal internal;

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepPrototype clone = (DeepPrototype)super.clone();
        clone.setInternal((Internal)internal.clone());
        return clone;
    };

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Internal getInternal() {
        return internal;
    }

    public void setInternal(Internal internal) {
        this.internal = internal;
    }

    @Override
    public String toString() {
        return "DeepPrototype{" +
                "a='" + a + '\'' +
                ", internal=" + internal +
                '}';
    }
}

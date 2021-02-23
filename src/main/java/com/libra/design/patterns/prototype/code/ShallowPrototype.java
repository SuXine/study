package com.libra.design.patterns.prototype.code;

/**
 * Description: 浅克隆类
 *
 * @author sx
 * @date 2021-02-23
 */
public class ShallowPrototype implements Cloneable{
    private String a;
    private Internal internal;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
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
        return "ShallowPrototype{" +
                "a='" + a + '\'' +
                ", internal=" + internal +
                '}';
    }
}

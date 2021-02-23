package com.libra.design.patterns.adapter.code;

/**
 * Description: 原类
 *
 * @author sx
 * @date 2021-02-04
 */
public class Source {
    private String name;

    public Source() {
    }

    public Source(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                '}';
    }
}

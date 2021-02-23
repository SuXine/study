package com.libra.design.patterns.adapter.code;

/**
 * Description: 目标类
 *
 * @author sx
 * @date 2021-02-04
 */
public class Target {
    private String name;

    public Target() {
    }

    public Target(String name) {
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
        return "Target{" +
                "name='" + name + '\'' +
                '}';
    }
}

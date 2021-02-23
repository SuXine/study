package com.libra.design.patterns.composite.code;

/**
 * Description: 实体抽象类
 *
 * @author sx
 * @date 2021-02-22
 */
public abstract class Entity {
    protected String name;

    public Entity(String name) {
        this.name = name;
    }

    public abstract Entity add(Entity e);
    public abstract void remove(Entity e);
    public abstract void display(Integer depth);
}

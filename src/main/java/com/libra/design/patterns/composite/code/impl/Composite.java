package com.libra.design.patterns.composite.code.impl;

import com.libra.design.patterns.composite.code.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 枝干实体
 *
 * @author sx
 * @date 2021-02-22
 */
public class Composite extends Entity {

    private List<Entity> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public Entity add(Entity e) {
        children.add(e);
        return this;
    }

    @Override
    public void remove(Entity e) {
        children.remove(e);
    }

    @Override
    public void display(Integer depth) {
        String s = "";
        for (int i = 0; i < depth; i++) {
            s += "-";
        }
        System.out.println(s + name);
        children.forEach(item -> {
            item.display(depth + 2);
        });
    }
}

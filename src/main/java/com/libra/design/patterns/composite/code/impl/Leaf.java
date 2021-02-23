package com.libra.design.patterns.composite.code.impl;

import com.libra.design.patterns.composite.code.Entity;

/**
 * Description: 叶子实体
 *
 * @author sx
 * @date 2021-02-22
 */
public class Leaf extends Entity {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public Entity add(Entity e) {
        throw new RuntimeException("叶子节点不能添加子节点");
    }

    @Override
    public void remove(Entity e) {
        throw new RuntimeException("叶子节点不存在子节点，无法删除！");
    }

    @Override
    public void display(Integer depth) {
        String s = "";
        for (int i = 0; i < depth; i++) {
            s += "-";
        }
        System.out.println(s + name);
    }
}

package com.libra.design.patterns.composite.code;

import com.libra.design.patterns.composite.code.impl.Composite;
import com.libra.design.patterns.composite.code.impl.Leaf;

/**
 * Description: 测试
 *
 * @author sx
 * @date 2021-02-22
 */
public class Main {
    public static void main(String[] args) {
        Entity root = new Composite("根节点");

        root.add(new Composite("枝干节点1")
                .add(new Composite("枝干节点1-1")
                        .add(new Leaf("叶子节点1-1-1")
                        )
                ).add(new Composite("枝干节点1-2")
                        .add(new Composite("枝干节点1-2-1")
                                .add(new Leaf("叶子节点1-2-1-1"))
                                .add(new Leaf("叶子节点1-2-1-2"))
                                .add(new Leaf("叶子节点1-2-1-3"))
                        )
                )
                .add(new Composite("枝干节点2-1")
                        .add(new Leaf("叶子节点2-1-1")
                        )
                ).add(new Composite("枝干节点2-2")
                        .add(new Composite("枝干节点2-2-1")
                                .add(new Leaf("叶子节点2-2-1-1"))
                                .add(new Leaf("叶子节点2-2-1-2"))
                                .add(new Leaf("叶子节点2-2-1-3"))
                        )
                )
        );

        root.display(0);
    }
}

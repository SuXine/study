package com.libra.design.patterns.flyweight.code;

/**
 * Description: 主类
 *
 * @author sx
 * @date 2021-02-22
 */
public class Main {
    public static void main(String[] args) {
        Integer extrinsicstate = 22;

        Flyweight concretes = FlyweightFactory.getConcretes(1);
        concretes.operation(--extrinsicstate);

        Flyweight concretes2 = FlyweightFactory.getConcretes(2);
        concretes.operation(--extrinsicstate);

        Flyweight concretes3 = FlyweightFactory.getConcretes(3);
        concretes.operation(--extrinsicstate);

        Flyweight concretes4 = FlyweightFactory.getConcretes(4);
        concretes.operation(--extrinsicstate);

        Flyweight flyweight = FlyweightFactory.creatUnsharedConcrete();
        flyweight.operation(--extrinsicstate);
    }
}

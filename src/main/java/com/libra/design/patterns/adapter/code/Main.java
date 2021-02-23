package com.libra.design.patterns.adapter.code;

/**
 * Description: 主类
 *
 * @author sx
 * @date 2021-02-04
 */
public class Main {
    public static void main(String[] args) {
        Source source = new Source("小红");
        System.out.println("转化前：");
        printSource(source);
        System.out.println("转化后：");
        printTarget(Adapter.toTarget(source));
    }

    public static void printSource(Source source) {
        System.out.println(source.toString());
    }

    public static void printTarget(Target target) {
        System.out.println(target.toString());
    }
}

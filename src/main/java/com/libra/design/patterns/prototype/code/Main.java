package com.libra.design.patterns.prototype.code;

/**
 * Description: 主方法
 *
 * @author sx
 * @date 2021-02-23
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("---------浅克隆------------");
        Internal shallowInternal = new Internal("中国", 1L);
        ShallowPrototype shallowPrototype = new ShallowPrototype();
        shallowPrototype.setA("浅克隆");
        shallowPrototype.setInternal(shallowInternal);
        ShallowPrototype shallowClone = (ShallowPrototype) shallowPrototype.clone();
        System.out.println("浅克隆：shallowClone:" + shallowClone.toString());
        Internal internalShallowClone = shallowClone.getInternal();
        internalShallowClone.setArea("中国 - 克隆后");
        System.out.println("浅克隆 - 修改Internal：shallowPrototype:" + shallowPrototype.toString());
        System.out.println("浅克隆 - 修改Internal：shallowClone:" + shallowClone.toString());

        System.out.println("---------深克隆------------");
        Internal deepInternal = new Internal("中国", 1L);
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.setA("深克隆");
        deepPrototype.setInternal(deepInternal);
        DeepPrototype deepClone = (DeepPrototype) deepPrototype.clone();
        System.out.println("深克隆：deepClone:" + deepClone.toString());
        Internal internalDeepClone = deepClone.getInternal();
        internalDeepClone.setArea("中国 - 克隆后");
        System.out.println("深克隆 - 修改Internal：deepPrototype:" + deepPrototype.toString());
        System.out.println("深克隆 - 修改Internal：deepClone:" + deepClone.toString());
    }
}

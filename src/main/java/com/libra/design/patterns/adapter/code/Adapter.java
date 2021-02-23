package com.libra.design.patterns.adapter.code;

/**
 * Description: 转换类
 *
 * @author sx
 * @date 2021-02-04
 */
public class Adapter {
    public static Source toSource(Target target){
        return new Source(target.getName());
    }

    public static Target toTarget(Source source){
        return new Target(source.getName());
    }
}

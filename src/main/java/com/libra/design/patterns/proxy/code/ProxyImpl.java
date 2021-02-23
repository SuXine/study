package com.libra.design.patterns.proxy.code;

/**
 * Description: 被代理类
 *
 * @author sx
 * @date 2021-01-15
 */
public class ProxyImpl implements  ProxyInterface {
    @Override
    public void proxyMethod() {
        System.out.println("主方法");
    }
}

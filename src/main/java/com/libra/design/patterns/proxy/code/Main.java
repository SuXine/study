package com.libra.design.patterns.proxy.code;


import java.lang.reflect.Proxy;

/**
 * Description: 主方法
 *
 * @author sx
 * @date 2021-01-15
 */
public class Main {

    public static void main(String[] args) {
        ProxyImpl impl = new ProxyImpl();

        ProxyInterface o1 = (ProxyInterface)Proxy.newProxyInstance(ProxyImpl.class.getClassLoader(), new Class[]{ProxyInterface.class}, (proxy, method, arg) -> {
            System.out.println("代理前");
            Object o = method.invoke(impl,arg);
            System.out.println("代理后");
            return o;
        });

        o1.proxyMethod();
    }
}

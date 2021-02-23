package com.libra.design.patterns.responsibility.code;

import com.libra.design.patterns.responsibility.code.filter.FilterChain;
import com.libra.design.patterns.responsibility.code.filter.impl.HttpFilterA;
import com.libra.design.patterns.responsibility.code.filter.impl.HttpFilterB;
import com.libra.design.patterns.responsibility.code.filter.impl.HttpFilterC;

public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        Response response = new Response();
        FilterChain chain = new FilterChain();
        FilterChain chain2 = new FilterChain();
        chain2.add(new HttpFilterA()).add(new HttpFilterB());
        chain.add(new HttpFilterA()).add(new HttpFilterB()).add(new HttpFilterC()).add(chain2).doFilter(request, response, chain);

    }
}

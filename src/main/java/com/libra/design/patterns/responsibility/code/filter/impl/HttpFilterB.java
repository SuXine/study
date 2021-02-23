package com.libra.design.patterns.responsibility.code.filter.impl;

import com.libra.design.patterns.responsibility.code.Request;
import com.libra.design.patterns.responsibility.code.Response;
import com.libra.design.patterns.responsibility.code.filter.Filter;
import com.libra.design.patterns.responsibility.code.filter.FilterChain;

public class HttpFilterB implements Filter {
    @Override
    public Boolean doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("过滤器B处理request");
        filterChain.doFilter(request, response, filterChain);
        System.out.println("过滤器B处理response");
        return Boolean.TRUE;
    }
}

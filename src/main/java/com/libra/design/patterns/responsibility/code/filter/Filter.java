package com.libra.design.patterns.responsibility.code.filter;

import com.libra.design.patterns.responsibility.code.Request;
import com.libra.design.patterns.responsibility.code.Response;

public interface Filter {
    Boolean doFilter(Request request, Response response,FilterChain filterChain);
}

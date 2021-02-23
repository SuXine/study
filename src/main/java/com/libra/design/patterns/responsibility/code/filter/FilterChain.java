package com.libra.design.patterns.responsibility.code.filter;

import com.libra.design.patterns.responsibility.code.Request;
import com.libra.design.patterns.responsibility.code.Response;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

    private List<Filter> filters  = new ArrayList<>();
    private Integer index = 0;

    public FilterChain add(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public Filter getNext(Class clazz){
        for (int i = 0; i < filters.size(); i++) {
            if (filters.get(i).getClass().equals(clazz)){
                return  i+1<filters.size() ? filters.get(i+1) : null;
            }
        }
        return null;
    }

    @Override
    public Boolean doFilter(Request request, Response response,FilterChain filterChain) {
        if (!CollectionUtils.isEmpty(filters)) {
            if (index < filters.size()) {
                if (filters.get(index) instanceof FilterChain) {
                    filters.get(index).doFilter(request, response, (FilterChain)filters.get(index));
                }else {
                    filters.get(index++).doFilter(request, response, filterChain);
                }
            }
        }
        return Boolean.TRUE;
    }
}

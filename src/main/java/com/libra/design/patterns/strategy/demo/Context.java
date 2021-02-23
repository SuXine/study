package com.libra.design.patterns.strategy.demo;

import com.libra.design.patterns.strategy.demo.count.Count;

public class Context {
    private Count count;

    public Context(Count count){
        this.count = count;
    }

    public Double count(Double total,Double num1,Double num2 ){
       return count.count(total, num1, num2);
    }
}

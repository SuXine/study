package com.libra.design.patterns.factory.code.abs.magic.traffic;

import com.libra.design.patterns.factory.code.abs.modern.traffic.ModernTraffic;

public class Air extends ModernTraffic {
    @Override
    public void go(){
        System.out.println("Air go ...");
    }
}

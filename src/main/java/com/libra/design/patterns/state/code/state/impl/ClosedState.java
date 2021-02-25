package com.libra.design.patterns.state.code.state.impl;

import com.libra.design.patterns.state.code.state.CarStatue;

/**
 * Description: 关状态
 *
 * @author sx
 * @date 2021-02-25
 */
public class ClosedState extends CarStatue {
    @Override
    public void openDoor() {
        System.out.println("开门完成");
    }

    @Override
    public void closeDoor() {
        System.out.println("车门已关");
    }

    @Override
    public void runCar() {
        System.out.println("开车完成");
    }

    @Override
    public void stopCar() {
        System.out.println("停车完成");
    }
}

package com.libra.design.patterns.state.code.state.impl;

import com.libra.design.patterns.state.code.state.CarStatue;

/**
 * Description: 开门状态
 *
 * @author sx
 * @date 2021-02-25
 */
public class OpenState extends CarStatue {
    @Override
    public void openDoor() {
        System.out.println("不允许开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门完成");
    }

    @Override
    public void runCar() {
        System.out.println("开门状态不允许开车");
    }

    @Override
    public void stopCar() {
        System.out.println("开门状态不允许停车");
    }
}

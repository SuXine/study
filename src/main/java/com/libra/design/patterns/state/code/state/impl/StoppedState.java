package com.libra.design.patterns.state.code.state.impl;

import com.libra.design.patterns.state.code.state.CarStatue;

/**
 * Description: 开车状态
 *
 * @author sx
 * @date 2021-02-25
 */
public class StoppedState extends CarStatue {
    @Override
    public void openDoor() {
        System.out.println("开门完成");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门完成");
    }

    @Override
    public void runCar() {
        System.out.println("车辆行驶中，不能再启动");
    }

    @Override
    public void stopCar() {
        System.out.println("车辆已停止");
    }
}

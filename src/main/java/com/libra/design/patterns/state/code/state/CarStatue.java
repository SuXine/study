package com.libra.design.patterns.state.code.state;

/**
 * Description: 状态类
 *
 * @author sx
 * @date 2021-02-25
 */
public abstract class CarStatue {
    public abstract void openDoor();
    public abstract void closeDoor();
    public abstract void runCar();
    public abstract void stopCar();
}

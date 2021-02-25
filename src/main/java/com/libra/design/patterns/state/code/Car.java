package com.libra.design.patterns.state.code;

import com.libra.design.patterns.state.code.state.CarStatue;

/**
 * Description: 汽车类
 *
 * @author sx
 * @date 2021-02-25
 */
public class Car {
    private CarStatue carStatue;

    protected void openDoor() {
        carStatue.openDoor();
    }

    protected void closeDoor() {
        carStatue.closeDoor();
    }

    protected void runCar() {
        carStatue.runCar();
    }

    protected void stopCar() {
        carStatue.stopCar();
    }

    public Car(CarStatue carStatue) {
        this.carStatue = carStatue;
    }
}

package com.libra.design.patterns.state.code;

import com.libra.design.patterns.state.code.state.impl.RunningState;

/**
 * Description: 主类
 *
 * @author sx
 * @date 2021-02-25
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car(new RunningState());
        car.openDoor();
        car.runCar();
        car.closeDoor();
        car.stopCar();
    }
}

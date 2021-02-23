package com.libra.design.patterns.observer.code.observer;

import com.libra.design.patterns.observer.code.Event;
import com.libra.design.patterns.observer.code.observable.Observable;
import com.libra.design.patterns.observer.code.observable.ObservableA;
import com.libra.design.patterns.observer.code.observable.ObservableB;
import com.libra.design.patterns.observer.code.observable.ObservableC;

/**
 * Description: 观察者C
 *
 * @author sx
 * @date 2020-12-14
 */
public class ObserverC implements Observer {
    @Override
    public void operation(Event event) {
        Observable source = event.getSource();
        if (source instanceof ObservableA) {
            System.out.println("被观察者A 发生了事件，观察者C将进行处理");
        }
        if (source instanceof ObservableB) {
            System.out.println("被观察者B 发生了事件，观察者C将进行处理");
        }
        if (source instanceof ObservableC) {
            System.out.println("被观察者C 发生了事件，观察者C将进行处理");
        }
    }
}

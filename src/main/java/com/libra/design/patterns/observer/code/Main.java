package com.libra.design.patterns.observer.code;

import com.libra.design.patterns.observer.code.observable.Observable;
import com.libra.design.patterns.observer.code.observable.ObservableA;
import com.libra.design.patterns.observer.code.observable.ObservableB;
import com.libra.design.patterns.observer.code.observable.ObservableC;
import com.libra.design.patterns.observer.code.observer.Observer;
import com.libra.design.patterns.observer.code.observer.ObserverA;
import com.libra.design.patterns.observer.code.observer.ObserverB;
import com.libra.design.patterns.observer.code.observer.ObserverC;

/**
 * Description: 主运行程序
 *
 * @author sx
 * @date 2020-12-14
 */
public class Main {
    public static void main(String[] args) {
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();
        Observer observerC = new ObserverC();

        Observable o1 = new ObservableA();
        o1.addObserverList(observerA).addObserverList(observerB).addObserverList(observerC);
        o1.happen();
        Observable o2 = new ObservableB();
        o2.addObserverList(observerA).addObserverList(observerB).addObserverList(observerC);
        o2.happen();
        Observable o3 = new ObservableC();
        o3.addObserverList(observerA).addObserverList(observerB).addObserverList(observerC);
        o3.happen();
    }
}

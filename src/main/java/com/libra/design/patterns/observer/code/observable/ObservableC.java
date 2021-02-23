package com.libra.design.patterns.observer.code.observable;

import com.libra.design.patterns.observer.code.Event;
import com.libra.design.patterns.observer.code.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 被观察者C
 *
 * @author sx
 * @date 2020-12-14
 */
public class ObservableC implements Observable {
    List<Observer> observerList = new ArrayList<>();

    @Override
    public Observable addObserverList(Observer observer) {
        this.observerList.add(observer);
        return this;
    }

    /**
     * happen : 发生事情
     * @author sx
     * @date 2020/12/14 17:19
     **/
    @Override
    public void happen() {
        Event event = new Event(this);
        observerList.forEach(item ->{
            item.operation(event);
        });
    }
}
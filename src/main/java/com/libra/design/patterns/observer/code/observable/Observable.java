package com.libra.design.patterns.observer.code.observable;

import com.libra.design.patterns.observer.code.observer.Observer;

public interface Observable {
    void happen();

    Observable addObserverList(Observer observer);
}

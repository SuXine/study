package com.libra.design.patterns.observer.code;

import com.libra.design.patterns.observer.code.observable.Observable;

import java.util.Date;

/**
 * Description: 被观察者的事件
 *
 * @author sx
 * @date 2020-12-14
 */
public class Event {
    private Date time;
    private Observable source;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Observable getSource() {
        return source;
    }

    public void setSource(Observable source) {
        this.source = source;
    }

    public Event(Observable source) {
        this.source = source;
        this.time = new Date();
    }
}

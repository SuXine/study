package com.libra.design.patterns.observer.code.observer;

import com.libra.design.patterns.observer.code.Event;

public interface Observer {
    /**
     * operation : 被发生的时候进行的操作
     *
     * @param event: 事件
     * @return void : 没有返回值
     * @author sx
     * @date 2020/12/14 17:17
     */
    void operation(Event event);
}

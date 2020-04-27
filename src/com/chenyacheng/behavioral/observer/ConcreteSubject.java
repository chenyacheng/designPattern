package com.chenyacheng.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题（Concrete Subject）角色：也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象。
 *
 * @author chenyacheng
 * @date 2020/04/27
 */
public class ConcreteSubject implements Subject {

    private List<Observer> weixinUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer observer : weixinUserList) {
            observer.update(message);
        }
    }
}

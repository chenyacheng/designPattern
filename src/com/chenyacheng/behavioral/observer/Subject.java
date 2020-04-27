package com.chenyacheng.behavioral.observer;

/**
 * 抽象主题（Subject）角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。
 *
 * @author chenyacheng
 * @date 2020/04/27
 */
public interface Subject {

    /**
     * 加入
     *
     * @param observer observer
     */
    void attach(Observer observer);

    /**
     * 分开
     *
     * @param observer observer
     */
    void detach(Observer observer);

    /**
     * 通知
     *
     * @param message 消息
     */
    void notify(String message);
}

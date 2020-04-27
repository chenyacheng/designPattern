package com.chenyacheng.behavioral.observer;

/**
 * 微信某个公众号的更新通知
 *
 * @author chenyacheng
 * @date 2020/04/27
 */
public class ObserverPattern {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver user1 = new ConcreteObserver("xiaoming");
        ConcreteObserver user2 = new ConcreteObserver("xiaohua");
        subject.attach(user1);
        subject.attach(user2);
        subject.notify("专栏更新");
        subject.detach(user1);
        subject.detach(user2);
    }
}

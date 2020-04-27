package com.chenyacheng.creational.factory;

/**
 * 具体产品：工厂方法模式所创建的具体实例对象。
 *
 * @author chenyacheng
 * @date 2020/04/26
 */
public class Apple implements Fruit{

    @Override
    public void get() {
        System.out.println("吃苹果");
    }
}

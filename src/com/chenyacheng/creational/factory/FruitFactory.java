package com.chenyacheng.creational.factory;

/**
 * 抽象工厂：工厂方法模式的核心，任何工厂类都必须实现这个接口。
 *
 * @author chenyacheng
 * @date 2020/04/26
 */
public interface FruitFactory {

    /**
     * 得到水果
     *
     * @return Fruit的对象
     */
    Fruit getFruit();
}

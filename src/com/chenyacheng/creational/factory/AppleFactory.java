package com.chenyacheng.creational.factory;

/**
 * 具体工厂：具体工厂类是抽象工厂的一个实现，负责实例化产品对象。
 *
 * @author chenyacheng
 * @date 2020/04/26
 */
public class AppleFactory implements FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}

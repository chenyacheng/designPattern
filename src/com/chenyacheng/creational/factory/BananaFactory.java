package com.chenyacheng.creational.factory;

/**
 * @author chenyacheng
 * @date 2020/04/26
 */
public class BananaFactory implements FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}

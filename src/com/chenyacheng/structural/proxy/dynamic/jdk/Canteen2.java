package com.chenyacheng.structural.proxy.dynamic.jdk;

/**
 * 定义商家
 *
 * @author chenyacheng
 * @date 2020/08/05
 */
public class Canteen2 implements Producer2 {
    @Override
    public void sell() {
        System.out.println("小卖部进行卖货");
    }
}

package com.chenyacheng.structural.proxy.statics;

/**
 * 目标对象
 * 定义一个小卖部,帮产家卖货
 *
 * @author chenyacheng
 * @date 2020/08/05
 */
public class Canteen implements Producer {
    @Override
    public void sell() {
        System.out.println("--------调查中...--------------");
        System.out.println("--------调查结束---------------");
        System.out.println("~~~~~~~~情况属实，同意扶贫~~~~~~~");
    }
}

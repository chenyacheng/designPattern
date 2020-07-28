package com.chenyacheng.behavioral.strategy;

/**
 * @author chenyacheng
 * @date 2020/07/27
 */
public class Share {

    public static void main(String[] args) {
        new DealContext(new DealSina(),"微博");
        new DealContext(new DealWeChat(),"微信");
    }
}

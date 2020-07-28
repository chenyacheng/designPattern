package com.chenyacheng.behavioral.strategy;

/**
 * 分享到微信
 *
 * @author chenyacheng
 * @date 2020/07/27
 */
public class DealWeChat implements DealStrategy {

    @Override
    public void dealMethod(String option) {
        System.out.println("分享到" + option);
    }
}

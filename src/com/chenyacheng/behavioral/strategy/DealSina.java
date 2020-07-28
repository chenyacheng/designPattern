package com.chenyacheng.behavioral.strategy;

/**
 * 分享到新浪微博
 *
 * @author chenyacheng
 * @date 2020/07/27
 */
public class DealSina implements DealStrategy {

    @Override
    public void dealMethod(String option) {
        System.out.println("请分享到" + option);
    }
}

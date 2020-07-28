package com.chenyacheng.behavioral.strategy;

/**
 * 定义策略接口
 *
 * @author chenyacheng
 * @date 2020/07/27
 */
interface DealStrategy {

    /**
     * 策略方法
     *
     * @param option 选项
     */
    void dealMethod(String option);
}

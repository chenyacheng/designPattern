package com.chenyacheng.behavioral.strategy;

/**
 * 定义上下文，负责使用DealStrategy角色
 *
 * @author chenyacheng
 * @date 2020/07/27
 */
public class DealContext {

    public  DealContext(DealStrategy deal, String type) {
        deal.dealMethod(type);
    }
}

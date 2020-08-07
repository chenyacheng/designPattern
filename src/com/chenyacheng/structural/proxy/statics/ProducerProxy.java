package com.chenyacheng.structural.proxy.statics;

/**
 * 代理对象
 * 定义产家的代理商,也具备卖货的功能
 *
 * @author chenyacheng
 * @date 2020/08/05
 */
public class ProducerProxy implements Producer {

    private final Producer producer;

    public ProducerProxy(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void sell() {
        System.out.println("--------李书记,申请扶贫---------");
        System.out.println("--------收到扶贫请求------------");
        producer.sell();
        System.out.println("--------扶贫成功---------------");
        System.out.println("~~~~~~~~已脱贫，过上小康生活------");
    }

    public static void main(String[] args) {
        // 目标对象
        Producer producer = new Canteen();
        // 代理对象，把目标对象传给代理对象，建立代理关系
        ProducerProxy producerProxy = new ProducerProxy(producer);
        producerProxy.sell();
    }
}

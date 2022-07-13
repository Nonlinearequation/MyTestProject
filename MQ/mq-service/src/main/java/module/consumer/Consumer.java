package module.consumer;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

/**
 * @author 方希萌
 * @version 1.0
 * @description 消费者
 * @package com.melon.module
 * @date 2022/4/1
 */
public class Consumer {

    public static void main(String[] args) throws MQClientException {
        //1. 创建消费者Consumer，指定消费者组名
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("group-melon");
        //2. 指定NameServer地址
        consumer.setNamesrvAddr("111.172.234.2:9876");
        //3. 订阅主题Topic和Tag
        consumer.subscribe("topic-sync","*");
        //4. 设置回调函数，处理消息
        consumer.registerMessageListener((MessageListenerConcurrently) (list, consumeConcurrentlyContext) -> {
            System.out.printf("%s 接收消息： %s %n", Thread.currentThread().getName(), list);
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        });

        //5. 启动消费者
        consumer.start();

        System.out.printf("Consumer Started.%n");

    }

}

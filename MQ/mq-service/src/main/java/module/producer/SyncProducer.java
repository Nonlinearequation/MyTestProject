package module.producer;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.util.concurrent.TimeUnit;

/**
 * @author 方希萌
 * @version 1.0
 * @description 同步消息
 * @package com.melon.module
 * @date 2022/4/1
 */
public class SyncProducer {

    public static void main(String[] args) throws MQClientException, MQBrokerException, RemotingException, InterruptedException {
        //1. 创建消息生产者producer，并指定生产者组名
        DefaultMQProducer producer = new DefaultMQProducer("group-melon");
        //2. 指定nameServer地址
        producer.setNamesrvAddr("111.172.234.2:9876");
        //3. 启动producer
        producer.start();

        for (int i = 0; i < 10; i++) {
            //4. 创建消息对象，指定主题Topic、Tag消息体
            /**
             * 参数1：消息主题Topic
             * 参数2：消息Tag
             * 参数3： 消息内容
             */
            Message message = new Message("topic-melon", "Tag3", ("同步消息 hello world:" + i).getBytes());
            //5. 发送消息
            SendResult result = producer.send(message);
            //消息ID
            String msgId = result.getMsgId();
            //消息发送状态
            SendStatus sendStatus = result.getSendStatus();
            //消息接收队列ID
            MessageQueue messageQueue = result.getMessageQueue();
            System.out.println("同步消息：消息ID:" + msgId + ",消息发送状态:"+ sendStatus + "消息接收队列ID:" + messageQueue);
            // 线程睡1秒
            TimeUnit.SECONDS.sleep(1);
        }

        //6. 关闭生产者producer
        producer.shutdown();

    }


}

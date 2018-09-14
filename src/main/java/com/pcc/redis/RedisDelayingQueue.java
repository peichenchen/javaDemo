package com.pcc.redis;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import redis.clients.jedis.Jedis;

/**
 * 
 * @author peichenchen
 * @version 18/9/12 10:58
 */
public class RedisDelayingQueue<T> {

    // fastjson 序列化对象中存在 generic 类型时，需要使用 TypeReference
    private Type   TaskType = new TypeReference<TaskItem<T>>() {
                            }.getType();
    private Jedis  jedis;
    private String queueKey;

    public RedisDelayingQueue(Jedis jedis, String queueKey) {
        this.jedis = jedis;
        this.queueKey = queueKey;
    }

    public void delay(T msg) {
        System.out.println("dealy:" + msg);
        TaskItem<T> task = new TaskItem<T>();
        task.id = UUID.randomUUID().toString(); // 分配唯一的 uuid
        task.msg = msg;
        String s = JSON.toJSONString(task); // fastjson 序列化
        jedis.zadd(queueKey, System.currentTimeMillis() + 5000, s); // 塞入延时队列 ,5s 后再试
    }

    public void loop() {
        while (!Thread.interrupted()) {
            // 只取一条
            Set<String> values = jedis.zrangeByScore(queueKey, 0, System.currentTimeMillis(), 0, 1);
            System.out.println("loop:" + new Date() + ":" + values);
            if (values.isEmpty()) {
                try {
                    Thread.sleep(500); // 歇会继续
                } catch (InterruptedException e) {
                    break;
                }
                continue;
            }
            String s = values.iterator().next();
            if (jedis.zrem(queueKey, s) > 0) { // 抢到了
                TaskItem<T> task = JSON.parseObject(s, TaskType); // fastjson 反序列化
                this.handleMsg(task.msg);
            }
        }
    }

    public void handleMsg(T msg) {
        System.out.println(new Date() + ":" + msg);
    }

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        final RedisDelayingQueue<String> queue = new RedisDelayingQueue<>(jedis, "q-demo");
        Thread producer = new Thread() {

            @Override
            public void run() {
                for (int i = 10; i < 20; i++) {
                    queue.delay("codehole" + i);
                    try {
                        TimeUnit.MILLISECONDS.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        };
        Thread consumer = new Thread() {
            @Override
            public void run() {
                queue.loop();
            }

        };
        producer.start();
        consumer.start();
        try {
            producer.join();
            System.out.println(new Date() + ":" + "producer.join() finished");
            Thread.sleep(2000);
            consumer.interrupt();
            System.out.println(new Date() + ":" + "consumer.interrupt() finished");
            consumer.join();
            System.out.println(new Date() + ":" + "consumer.join() finished");
        } catch (InterruptedException e) {
        }
    }

    static class TaskItem<T> {
        public String id;
        public T      msg;
    }
}
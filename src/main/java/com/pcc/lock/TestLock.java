package com.pcc.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author peichenchen
 * @date 2019/03/25
 */
public class TestLock {

    public void test() throws Exception {
        final Lock lock = new ReentrantLock();
        lock.lock();


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }, "child thread -1");

        t1.start();
        Thread.sleep(1000);

        t1.interrupt();

        Thread.sleep(4000);
    }

    public static void main(String[] args) throws Exception {
        new TestLock().test();
    }

}

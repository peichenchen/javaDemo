package com.pcc.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author peichenchen
 * @date 2019/03/25
 */
public class TestLockInterruptibly {

    public void test3() throws Exception {
        final Lock lock = new ReentrantLock();
        lock.lock();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lockInterruptibly();
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted Exception.");
                }
            }
        }, "child thread -1");

        t1.start();
        Thread.sleep(1000);

        System.out.println(Thread.currentThread().getName() + " begin to interrupt.");
        t1.interrupt();
        System.out.println(Thread.currentThread().getName() + " has interrupted.");

        Thread.sleep(5000);
    }

    public static void main(String[] args) throws Exception {
        new TestLockInterruptibly().test3();
    }
}

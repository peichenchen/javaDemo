package com.pcc.lock;

/**
 * @author peichenchen
 * @date 2019/03/06
 */
public class Sync {
    public synchronized static void staticMethod1() throws InterruptedException {

        System.out.println("staticMethod1 called");

        Thread.sleep(2000);

    }


    public synchronized void method2() throws InterruptedException {

        System.out.println("method2 called");
        Thread.sleep(2000);

    }
}

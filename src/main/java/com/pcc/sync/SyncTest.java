package com.pcc.sync;

/**
 * @author peichenchen
 * @date 2019/03/06
 */
public class SyncTest {


    private static Sync sync = new Sync();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Task1());
        Thread t2 = new Thread(new Task2());

        t1.start();
        Thread.sleep(50);
        t2.start();
    }


    static class Task1 implements Runnable {

        @Override
        public void run() {
            try {
                sync.method2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    static class Task2 implements Runnable {

        @Override
        public void run() {
            try {
                sync.method2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}

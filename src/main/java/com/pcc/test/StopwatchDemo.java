package com.pcc.test;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

/**
 * @author peichenchen
 * @date 2018/01/18
 */
public class StopwatchDemo {

    public static void main(String[] args) throws InterruptedException {
        Stopwatch stopwatch = Stopwatch.createStarted();

        TimeUnit.SECONDS.sleep(2);

        stopwatch.stop();

        System.out.println(stopwatch.elapsed(TimeUnit.SECONDS));

        TimeUnit.SECONDS.sleep(1);

        System.out.println(stopwatch.elapsed(TimeUnit.MILLISECONDS));

    }

}

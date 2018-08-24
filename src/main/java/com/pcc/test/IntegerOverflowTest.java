package com.pcc.test;

/**
 * Created by peichenchen on 17/6/26.
 */
public class IntegerOverflowTest {

    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int b = max + max + 1;
        int c = max + 2;
        System.out.println("max:" + max);
        System.out.println("min:" + min);
        System.out.println(b);
        System.out.println(c);
    }
}

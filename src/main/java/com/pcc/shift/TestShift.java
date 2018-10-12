package com.pcc.shift;

/**
 * @author peichenchen
 * @date 2018/09/29
 */
public class TestShift {

    public static void main(String[] args) {
        // 左移位操作符实际上就是把二进制的数向左移，高位舍去，低位补零
        // x<<n = x*2^n
        System.out.println(1 << 1);
        System.out.println(1 << 2);
        System.out.println(10 << 3);
        System.out.println(1 << 10);
        System.out.println(100 << 12);
        System.out.println(67 << 10);
        System.out.println(Integer.toBinaryString(-123));


        // 右移是把二进制的数向右移位，低位舍去，高位补零
        // x>>n = x/2^n
        System.out.println(10 >> 1);
        System.out.println(10 >> 2);
        System.out.println(10 >> 3);


        System.out.println(Integer.MAX_VALUE);




    }

}

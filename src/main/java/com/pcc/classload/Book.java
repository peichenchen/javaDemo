package com.pcc.classload;

/**
 * @author peichenchen
 * @date 2019/03/06
 */
public class Book {
    public static void main(String[] args) {
        staticFunction();
    }

    static Book book = new Book();

    static {
        System.out.println("书的静态代码块");
    }

    {
        System.out.println("书的普通代码块");
        System.out.println("price=" + this.price);
    }

    Book() {
        System.out.println("书的构造方法");
        System.out.println("price=" + price + ",amount=" + amount);
    }

    public static void staticFunction() {
        System.out.println("书的静态方法");
    }

    int price = 110;
    static int amount = 112;
}

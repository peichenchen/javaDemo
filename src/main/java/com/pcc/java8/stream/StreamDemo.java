package com.pcc.java8.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author peichenchen
 * @date 2019/03/20
 */
public class StreamDemo {

    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("ddd2");
        lists.add("aaa2");
        lists.add("bbb1");
        lists.add("aaa1");
        lists.add("bbb3");
        lists.add("acc");
        lists.add("bbb2");
        lists.add("ddd1");


        lists.stream()
                .filter((s) -> s.startsWith("a"))
                .sorted()
                .forEach(System.out::println);



        lists.stream()
                .sorted()
                .forEach(System.out::println);

    }


}

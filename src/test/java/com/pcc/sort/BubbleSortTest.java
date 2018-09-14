package com.pcc.sort;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author peichenchen
 * @date 2018/09/14
 */
public class BubbleSortTest {
    @Test
    public void sort() throws Exception {
        Integer[] testdata = { 3, 21121, 11, 1, 23, 6, 8, 96, 12, 121, 31, 4, 2011, 11121 };
        Integer[] testdata2 = { 1 };
        Integer[] testdata3 = { 1, 0 };

        Integer[] sortedDatas = new BubbleSort().sort(testdata);
        Integer[] sortedDatas2 = new BubbleSort().sort(testdata2);
        Integer[] sortedDatas3 = new BubbleSort().sort(testdata3);

        List<Integer> integers = Arrays.asList(sortedDatas);
        List<Integer> integers2 = Arrays.asList(sortedDatas2);
        List<Integer> integers3 = Arrays.asList(sortedDatas3);

        System.out.println(integers);
        System.out.println(integers2);
        System.out.println(integers3);

    }

}
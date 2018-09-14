package com.pcc.sort;

/**
 * @author peichenchen
 * @date 2018/09/14
 */
public class BubbleSortTest {
    @Test
    public void sort() throws Exception {
        int[] testdata = { 3, 21121, 11, 44, 32, 1, 32, 1, 1, 544, 312, 43, 1, 23, 6, 8, 96, 12, 121, 31, 4, 2011,
                           11121 };
        int[] sortedDatas = new BubbleSort().sort(testdata);

        System.out.println(sortedDatas);

    }

}
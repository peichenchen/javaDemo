package com.pcc.sort;

/**
 * @author peichenchen
 * @date 2018/09/14
 */
public class BubbleSort {

    public int[] sort(int[] datas) {

        for (int i = datas.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (datas[j] > datas[j + 1]) {
                    int temp = datas[j];
                    datas[j] = datas[j + 1];
                    datas[j + 1] = temp;
                }
            }
        }

        return datas;
    }

}

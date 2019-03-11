package com.pcc.lc.sort;

/**
 * @author peichenchen
 * @date 2018/09/14
 */
public class BubbleSort {

    public Integer[] sort(Integer[] datas) {

        for (int i = datas.length - 1; i > 0; i--) {
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

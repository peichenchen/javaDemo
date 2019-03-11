package com.pcc.lc.sort;

import java.util.Arrays;

/**
 * https://blog.csdn.net/adusts/article/details/80882649
 *
 * @author peichenchen
 * @date 2019/03/02
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 2, 22, 44, 55, 43, 43, 43, 2212, 5454, 78675, 34, 33, 3, 38, 11, 12, 54, 32, 5, 5, 3, 3, 2, 876, 34, 2, 1, 2, 343, 88, 33, 4, 76, 87, 56, 45};
//        int[] arr = {4, 2, 5, 1};
        new QuickSort().quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }


    public void quickSort(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int base = arr[start];
        int i = start;
        int j = end;

        while (i < j) {

            // 由于枢值选取的是左边第一个，先从右边往左找
            while (arr[j] >= base && i < j) {
                j--;
            }
            while (arr[i] <= base && i < j) {
                i++;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, start, i);


        quickSort(arr, start, i - 1);
        quickSort(arr, i + 1, end);

    }

    private void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}

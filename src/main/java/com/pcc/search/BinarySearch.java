package com.pcc.search;

/**
 * 二分查找的2中实现，递归和非递归
 *
 * @author peichenchen
 * @date 2019/03/02
 */
public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6, 11, 12, 33, 44, 45, 46, 47, 50};

        System.out.println(binarySearch(arr, 0, arr.length - 1, 1));
        System.out.println(binarySearch(arr, 0, arr.length - 1, 3));
        System.out.println(binarySearch(arr, 0, arr.length - 1, 12));
        System.out.println(binarySearch(arr, 0, arr.length - 1, 47));
        System.out.println(binarySearch(arr, 0, arr.length - 1, 50));

        System.out.println(binarySearch(arr, 0, arr.length - 1, 0));
        System.out.println(binarySearch(arr, 0, arr.length - 1, 13));
        System.out.println(binarySearch(arr, 0, arr.length - 1, 35));
        System.out.println(binarySearch(arr, 0, arr.length - 1, 51));


        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 12));
        System.out.println(binarySearch(arr, 47));
        System.out.println(binarySearch(arr, 50));

        System.out.println(binarySearch(arr, 0));
        System.out.println(binarySearch(arr, 13));
        System.out.println(binarySearch(arr, 35));
        System.out.println(binarySearch(arr, 51));


    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //相当于除以2
            int mid = (end + start) >> 1;
            int midValue = arr[mid];
            if (midValue == target) {
                return mid;
            }

            if (midValue < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }


    static int binarySearch(int[] arr, int start, int end, int target) {

        if (start > end) {
            return -1;
        }

        //相当于除以2
        int mid = (end + start) >> 1;
        int midValue = arr[mid];
        if (midValue == target) {
            return mid;
        }

        if (midValue < target) {
            return binarySearch(arr, mid + 1, end, target);
        } else {
            return binarySearch(arr, start, mid - 1, target);
        }
    }


}

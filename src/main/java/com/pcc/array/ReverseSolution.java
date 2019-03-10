package com.pcc.array;

/**
 * 反转数组
 *
 * @author peichenchen
 * @date 2019/03/03
 */
public class ReverseSolution {

    public String reverseString(String str) {
        char[] chars = str.toCharArray();
        reverseString(chars);

        return String.valueOf(chars);
    }

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            swap(s, i, j);
            i++;
            j--;
        }

    }

    private void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

}

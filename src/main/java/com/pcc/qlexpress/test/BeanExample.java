package com.pcc.qlexpress.test;

/**
 * @author peichenchen
 * @date 2018/12/22
 */
public class BeanExample {
    public static String upper(String abc) {
        return abc.toUpperCase();
    }

    public boolean anyContains(String str, String searchStr) {

        char[] s = str.toCharArray();
        for (char c : s) {
            if (searchStr.contains(c + "")) {
                return true;
            }
        }
        return false;
    }
}

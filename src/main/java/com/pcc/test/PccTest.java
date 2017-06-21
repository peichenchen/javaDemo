package com.pcc.test;

import com.google.common.base.Stopwatch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PccTest {
    public static void main(String[] args) throws InterruptedException {

        try {
            String s = new String("one");
            String s1 = new String("one");
            String s2 = "one";
            String s3 = "o" + "ne";
            System.out.println(s == s1);
            System.out.println(s2 == s3);
            System.out.println(System.identityHashCode(s));
            System.out.println(System.identityHashCode(s1));
            System.out.println(System.identityHashCode(s2));
            System.out.println(System.identityHashCode(s3));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 获取本月第一天，时分秒设置为00:00:00
     * 
     * @return
     */
    public static Date $getFirstDayofThisMonth() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.DAY_OF_MONTH, 1);

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String ymd = format.format(calendar.getTime());

            format.applyPattern("yyyy-MM-dd HH:mm:ss");
            return format.parse(ymd + " 00:00:00");
        } catch (Exception e) {
            return null;
        }
    }

    /** 
     * 获取本月的最后一天，时分秒设置为23:59:59
     * @return
     */
    public static Date getLastDayofThisMonth() {
        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String last = format.format(ca.getTime());
        format.applyPattern("yyyy-MM-dd HH:mm:ss");
        try {
            return format.parse(last + " 23:59:59");
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
}

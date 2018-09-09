package com.company;

import java.util.Date;
import java.util.Locale;

/**
 * Created by Coldwarm on 18/7/27.
 */
public class Example {
    public static void main(String[] args) {
        Date today = new Date();
        String a = String.format(Locale.US,"%tb",today);
        System.out.println("格式化后的字符串为月份的英文缩写："+a);
        String b = String.format(Locale.US,"%tB",today);
        System.out.println("格式化后的字符串为月份的英文全写："+b);
        String c = String.format("%ta",today);
        System.out.println("月格式化后的字符串为星期："+c);
        String d = String.format("%tA",today);
        System.out.println("格式化后的字符串为星期："+d);
        String e = String.format("%tY",today);
        System.out.println("格式化后的字符串为4位的年份值："+e);
        String f = String.format("%ty",today);
        System.out.println("格式化后的字符串为2位的年份值："+f);
        String g = String.format("%tm",today);
        System.out.println("格式化后的字符串为2位的月份值："+g);
        String h = String.format("%td",today);
        System.out.println("格式化后的字符串为2位的日期值："+h);
        String i = String.format("%te",today);
        System.out.println("格式化后的字符串为1位的日期值："+i);
    }
}

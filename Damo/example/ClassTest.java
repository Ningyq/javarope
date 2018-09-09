package com.company;

import java.util.Date;

/**
 * Created by Coldwarm on 18/7/27.
 */
public class ClassTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("第1种方法：Object.getClass()");
        Class c1 = new Date().getClass();
        System.out.println(c1.getName());
        System.out.println("第2种方法：.class语法");
        Class c2 = boolean.class;
        System.out.println(c2.getName());
        System.out.println("第3种方法：Class.forName");
        Class c3 = Class.forName("java.lang.String");
        System.out.println(c3.getName());
        System.out.println("第4种方法：包装类的TYPE域");
        Class c4 = Double.TYPE;
        System.out.println(c4.getName());
    }
}

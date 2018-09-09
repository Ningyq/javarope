package com;

import java.awt.*;

public class CutTest {
    public static void main(String[] args){
        Cat cat1 = new Cat("Java",12,32, Color.BLACK);
        Cat cat2 = new Cat("C++",12,32, Color.WHITE);
        Cat cat3 = new Cat("Java",12,32, Color.BLACK);
        System.out.println("猫咪1号："+cat1);
        System.out.println("猫咪2号："+cat2);
        System.out.println("猫咪3号："+cat3);
        System.out.println("猫咪1号是否与猫咪2号相同："+ cat1.equals(cat2));
        System.out.println("猫咪1号是否与猫咪3号相同："+ cat1.equals(cat3));
    }
}

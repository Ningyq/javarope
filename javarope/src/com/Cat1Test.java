package com;

import java.awt.*;

public class Cat1Test {
    public static void main(String[] args){
        Cat1 cat1 = new Cat1("Java",12,32, Color.BLACK);
        Cat1 cat2 = new Cat1("C++",12,32, Color.WHITE);
        Cat1 cat3 = new Cat1("Java",12,32, Color.BLACK);
        System.out.println("猫咪1号的哈希码："+cat1.hashCode());
        System.out.println("猫咪2号的哈希码："+cat2.hashCode());
        System.out.println("猫咪3号的哈希码："+cat3.hashCode());
        System.out.println("猫咪1号是否与猫咪2号相同："+ cat1.equals(cat2));
        System.out.println("猫咪1号是否与猫咪3号相同："+ cat1.equals(cat3));
    }
}

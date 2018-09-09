package com;

import java.awt.*;

public class Cat1 {
    private String name;
    private int age;
    private double weight;
    private Color color;

    public Cat1(String name, int age, double weight, Color color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Cat1 cat1 = (Cat1)obj;
        return name.equals(cat1.name) && (age == cat1.age) && (weight == cat1.weight) && (color.equals(cat1.color));
    }
    @Override
    public int hashCode(){
        return 7*name.hashCode()+11*new Integer(age).hashCode()+13*new Double(weight).hashCode()+17*color.hashCode();
    }
}
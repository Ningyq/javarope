package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Coldwarm on 18/7/27.
 */
public class UsefulArray {
    public static Object increaseArray(Object array){
        Class<?>clazz = array.getClass();
        if (clazz.isArray()){
            Class<?>componentType = clazz.getComponentType();
            int length = Array.getLength(array);
            Object newArray = Array.newInstance(componentType,length + 5);
            System.arraycopy(array,0,newArray,0,length);
            return newArray;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] intArray = new int[10];
        System.out.println("整型数组原始长度是："+intArray.length);
        Arrays.fill(intArray,8);
        System.out.println("整型数组的内容：");
        System.out.println(Arrays.toString(intArray));
        int[] newIntArray = (int[])increaseArray(intArray);
        System.out.println("整型数组扩展后长度是："+newIntArray.length);
        System.out.println("整型数组的内容：");
        System.out.println(Arrays.toString(newIntArray));
    }
}

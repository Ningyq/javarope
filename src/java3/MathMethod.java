package java3;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class MathMethod {
    public static void main(String[] args) {
        System.out.println("30度的正弦值"+Math.sin(Math.PI/6));
        System.out.println("30度的余弦值"+Math.cos(Math.PI/6));
        System.out.println("30度的正切值"+Math.tan(Math.PI/6));

        System.out.println("0.75的反正切值"+Math.atan(0.75));
        System.out.println("0.5的反正弦值"+Math.asin(0.5));
        System.out.println("0.886的反余弦值"+Math.acos(0.886));

        System.out.println("30度的双曲正弦值"+Math.sinh(30));
        System.out.println("30度的双曲余弦值"+Math.cosh(30));
        System.out.println("30度的双曲正切值"+Math.tanh(30));

        System.out.println("2的立方根是："+Math.cbrt(2));
        System.out.println("e的6次方"+Math.exp(6));
        System.out.println("e的6次方"+Math.expm1(5));
        System.out.println("8的自然对数是："+Math.log(8));
        System.out.println("8的自然对数是："+Math.log1p(7));
        System.out.println("8的以10为底的对数"+Math.log10(8));
        System.out.println("2的4次方"+Math.pow(2,4));
        System.out.println("9的平方根"+Math.sqrt(9));

        BigInteger num1 = new BigInteger("12345");
        BigInteger num2 = new BigInteger("98765");
        System.out.println("高精度整数number1"+num1);
        System.out.println("高精度整数number2"+num2);
        System.out.println("高精度整数加法"+num1.add(num2));
        System.out.println("高精度整数减法"+num1.subtract(num2));
        System.out.println("高精度整数乘法"+num1.multiply(num2));
        System.out.println("高精度整数除法"+num1.divide(num2));

    }
}

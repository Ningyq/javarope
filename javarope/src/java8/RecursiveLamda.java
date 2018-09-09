package java8;

import java.util.function.IntFunction;

public class RecursiveLamda {
    public static void main(String[] args) {
        IntFunction<Long> factorialCal = RecursiveLamda::factorial;
        System.out.println(factorial(25));
        System.out.println(factorialCal.apply(25));
    }

    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

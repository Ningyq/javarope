package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class BasicLam {
    private static boolean isPrime(int number) {
//        if (number < 2) {
//            return false;
//        }
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;

        return number > 1 &&
                IntStream.range(2, number)
                .allMatch(n -> number % n != 0);
    }

    public static int findSquareOfMaxOdd(List<Integer> numbers) {
        return numbers.stream()
                .filter(i -> i % 2 != 0)
                .filter(i -> i > 3)
                .filter(i -> i < 100)
                .max(Comparator.naturalOrder())
                .map(i -> i * i)
                .get();
    }

    public static void main(String[] args) {
        System.out.println(isPrime(22));

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,30,7,34,87,134,86,234,879,32,543,131,13,13,132));

        System.out.println(findSquareOfMaxOdd(numbers));
    }
}

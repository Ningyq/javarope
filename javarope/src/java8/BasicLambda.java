package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class BasicLambda {

    public static int sumWithCondition(List<Integer> numbers , Predicate<Integer> predicate) {
//        int sum = 0;
//        Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//            int current = iterator.next();
//            if (predicate.test(current)) {
//                System.out.println(current);
//                sum  += current;
//            }
//        }
//        return sum;

        return numbers.parallelStream()
                .filter(predicate)
                .peek(System.out::println)
                .mapToInt(i -> i)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> numbers  = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,8,3,4,7,2,4,3,2,4,9,7,4,7,0,3,5,1));

        System.out.println(sumWithCondition(numbers, i -> i % 2 != 0));
    }
}

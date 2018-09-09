package java8;

import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class OperateStream {

    private static void runMap() {
        DoubleStream.of(1.5, 1.3, 1.9)
                .map(x -> x + 1)
                .forEach(System.out::println);
    }

    private static void runFlatMap() {
        IntStream.rangeClosed(1, 5)
                .flatMap(n -> IntStream.of(n, n * n))
                .forEach(System.out::println);
    }

    private static void runPeek() {
        Double sum = IntStream.rangeClosed(1, 5)
                .peek(System.out::println)
                .filter(n -> n % 2 == 1)
                .peek(System.out::println)
                .mapToDouble(Math::sqrt)
                .peek(System.out::println)
                .sum();

        System.out.println(sum);
    }

    private static void runReduce() {
        int sum = IntStream.rangeClosed(1, 5)
                .reduce(0,(left, right) -> left + right);
        System.out.println(sum);
    }

    private static void runStat() {
        DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
        stats.accept(100.0);
        stats.accept(132.0);
        stats.accept(19.0);
        stats.accept(140.0);
        stats.accept(340.0);
        stats.accept(970.0);

        long count = stats.getCount();
        double sum = stats.getSum();
        double average = stats.getAverage();
        double min = stats.getMin();
        double max = stats.getMax();

        System.out.printf("count = %d ,sum = %.2f ,average = %.2f ,min = %.2f ,max = %.2f ", count, sum, average, min, max);
    }

    public static void main(String[] args) {
//        runMap();
//        runFlatMap();
//        runPeek();
//        runReduce();
        runStat();
    }
}

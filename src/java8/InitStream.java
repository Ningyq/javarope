package java8;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InitStream {
    private static Stream<String> initByBuilder() {
        return Stream.<String>builder()
                .add("web")
                .add("os")
                .add("java")
                .add("c")
                .build();
    }

    private static Stream<String> initByCollection() {
        Set<String> names = new HashSet<>();
        names.add("java");
        names.add("c");
        names.add("os");
        names.add("web");

        return names.stream();
    }

    public static void main(String[] args) {
        Stream<String> stream = initByBuilder();
        stream.forEach(System.out::println);

        Stream<String> stream1 = initByCollection();
        stream1.forEach(System.out::println);

        Stream<String> stream2 = Stream.empty();
        stream2.forEach(System.out::println);

        IntStream stream3 = IntStream.rangeClosed(1, 10);
        stream3.forEach(System.out::println);

        Stream<String> stream4 = Stream.of("Hello World!");
        stream4.forEach(System.out::println);

        Stream<String> stream5 = Stream.of("Hello" ,"World!");
        stream5.forEach(System.out::println);

        Stream<Integer> stream6 = Stream.generate(new Random()::nextInt);
        stream6.limit(5).forEach(System.out::println);
    }
}

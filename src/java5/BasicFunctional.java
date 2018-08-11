package java5;

import java.util.function.Consumer;

public class BasicFunctional {
    public static void main(String[] args) {
        Consumer<String> c1 = x -> System.out.println(x.toLowerCase());
        Consumer<String> c2 = x -> System.out.println(x.toUpperCase());
//        Consumer<String> c2 = System.out::println;

//        c1.accept("ning");
        c2.andThen(c1).accept("Ningyq");
    }
}

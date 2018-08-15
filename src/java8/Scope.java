package java8;

import java.util.function.Function;

public class Scope {
    private Scope() {
        Function<String,String> function = x -> {
            System.out.println(this);
            return x;
        };

        Function<String,String> function1 = new Function<String, String>() {
            @Override
            public String apply(String s) {
                System.out.println(this);
                return s;
            }
        };

        System.out.println(function.apply("Dharma"));
    }

    public static void main(String[] args) {
        new Scope();
    }
}

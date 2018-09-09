package java1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListforEach {


    public static void main(String[] args) {
        List<String> stocks = new ArrayList<>();
        stocks.add("Google");
        stocks.add("Apple");
        stocks.add("Microsoft");
        stocks.add("Facebook");
        stocks.add("Amazon");

        Consumer<Object> consumer = new ListforEach().new MyConsumer();
        stocks.forEach(consumer);

        stocks.forEach(o -> System.out.println("P:" + o));

    }

    class MyConsumer implements Consumer<Object> {

        @Override
        public void accept(Object o){
            System.out.println("Processing:" + o);
        }
    }
}

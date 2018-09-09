package java1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Coldwarm on 18/7/29.
 */
public class GenericsClass<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        GenericsClass<Integer> items = new GenericsClass<>();
        items.setItem(344);
        System.out.println(items.getItem());
    }
}

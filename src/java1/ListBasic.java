package java1;

import java.util.ArrayList;
import java.util.List;

public class ListBasic {
    public static void main(String[] args) {
        List<String> vowels = new ArrayList<>();
        vowels.add("A");
        vowels.add("I");
        vowels.add(1,"E");
        vowels.set(1,"P");
        System.out.println(vowels);

        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("r");
        System.out.println(list);

        vowels.addAll(list);
        list.add("X");
        list.clear();
        System.out.println(list);
        System.out.println(vowels);
        System.out.println(list);


    }
}

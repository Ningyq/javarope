package java2;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class NumberSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Random ran = new Random();
        int count = 0;
        for (int i = 0 ; i < 10 ;i++) {
//            set.add(ran.nextInt(100));

            if(!set.add(ran.nextInt(100))) {
                i--;
                count++;
            }
        }

        Integer[] array = new Integer[set.size()];
        set.toArray(array);
        for (int value : array) {
            System.out.println(value);
        }

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(set.size());
        System.out.println(count);
    }
}

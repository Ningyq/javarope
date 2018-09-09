package java2;

import java.util.*;

public class ListID {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0 ; i < 10 ; i ++ ) {
            list.add(random.nextInt(123));
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();

        ListIterator<Integer> li = list.listIterator();
        for (li = list.listIterator();li.hasNext();) {
            li.next();
        }
        while (li.hasPrevious()) {
            System.out.print(li.previous() + " ");
        }
    }
}

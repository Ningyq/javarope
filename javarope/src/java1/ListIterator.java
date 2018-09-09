package java1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++){
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = (int)iterator.next();
            System.out.print(i+",");
        }
        System.out.println("\n"+list);

        iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = (int)iterator.next();
            if(i % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println("\n"+list);
    }
}

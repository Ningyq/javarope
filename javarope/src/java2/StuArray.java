package java2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StuArray {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("123,34,yyi");
        list1.add("4676,34,yyi");
        list1.add("086767,34,yyi");
        list1.add("5675,34,yyi");
        list1.add("456765,34,yyi");
        List<String> list2 = new ArrayList<>();
        list2.add("1234,43,454");
//        Iterator iterator = list1.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        for (String stu : list1) {
//            System.out.println(stu);
//        }
//        list1.remove("086767,34,yyi");
        list2.addAll(list1);
        System.out.println(list1);
        System.out.println(list2);
    }
}

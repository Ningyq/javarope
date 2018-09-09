package java3;

import java.util.*;

public class CityMap {
    public static void main(String[] args) {

        Map<String, List<String>> data = new LinkedHashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("xian");
        list1.add("xianyang");
        list1.add("weinan");

        List<String> list2 = new ArrayList<>();
        list2.add("qwe");
        list2.add("asrf");
        list2.add("egt");

        List<String> list3 = new ArrayList<>();
        list3.add("saf");
        list3.add("fsed");
        list3.add("ssef");

        data.put("shannxi",list1);
        data.put("eghwrkhb",list2);
        data.put("edmfl",list3);

//        System.out.println(data.get("shannxi"));
//        Set<String> set = data.keySet();
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        String[] array = new String[set.size()];
//        set.toArray(array);
//        for (String str : array) {
//            System.out.println(array);
//        }
        Set<Map.Entry<String,List<String>>> entrySet = data.entrySet();

        System.out.println(entrySet);
    }
}

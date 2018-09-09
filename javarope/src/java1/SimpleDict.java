package java1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleDict {
    public static void main(String[] args) {
        Map<String, List<String>> dictionary = new HashMap<>();

        List<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Aeroplone");
        listA.add("Abuse");
        listA.add("Abandon");
        listA.add("Abj");

        List<String> listB = new ArrayList<>();
        listB.add("Bjnj");
        listB.add("Bjnhiu");
        listB.add("Bhbu");
        listB.add("Bjkj");
        listB.add("Bwqd");

        List<String> listC = new ArrayList<>();
        listC.add("Cjhni");
        listC.add("Cnkln");
        listC.add("Ciiuhn");
        listC.add("Coij");
        listC.add("Cho");

        dictionary.put("A", listA);
        dictionary.put("B", listB);
        dictionary.put("C", listC);
        System.out.println(dictionary.get("A"));

        for (Map.Entry<String,List<String>> word : dictionary.entrySet()) {
            System.out.println(word.getKey()+" : "+word.getValue());
        }

    }
}

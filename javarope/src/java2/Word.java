package java2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Map<String,String> word = new HashMap<>();
        word.put("apple","苹果");
        word.put("water","水");
        word.put("banana","香蕉");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(word.getOrDefault(str,"你查找的单词不存在!"));

//        boolean b = word.containsKey(str);
//        if (b) {
//            System.out.println("你查找的单词为："+word.get(str));
//        }else {
//            System.out.println("你查找的单词不存在!");
//        }
    }
}

package java1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Created by Coldwarm on 18/7/29.
 */
public class MapBasic {

    public static void main(String[] args) {
        Map<String,String> data = new HashMap<>();
        data.put("A","A");
        data.put("B","B");
        data.put("C","C");
        data.put("A","D");
        data.put(null,"D");


        System.out.println(data);

        System.out.println(data.get(null));

        System.out.println(data.getOrDefault("C","Not exist!"));

        System.out.println(data.containsKey("C"));
        System.out.println(data.containsValue("D"));

        Set<Map.Entry<String,String>> entrySet = data.entrySet();
        System.out.println(entrySet);
    }
}

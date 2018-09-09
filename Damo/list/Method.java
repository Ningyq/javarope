package java1;

/**
 * Created by Coldwarm on 18/7/29.
 */
public class Method {
    public static <T> boolean isEqual(GenericsClass<T> g1, GenericsClass<T> g2){
        return g1.getItem().equals(g2.getItem());
    }

    public static  <T extends Comparable<T>> int compare(T t1,T t2){
        return t1.compareTo(t2);
    }

    public static void main(String[] args) {
        GenericsClass<String> g1 = new GenericsClass<>();
        g1.setItem("xupt");
        GenericsClass<String> g2 = new GenericsClass<>();
        g2.setItem("xupt");
        GenericsClass<Integer> g11 = new GenericsClass<>();
        GenericsClass<Integer> g12 = new GenericsClass<>();
        g11.setItem(123);
        g12.setItem(321);

        boolean isEqual1 = Method.<Integer>isEqual(g11, g12);
        System.out.println(isEqual1);

        boolean isEqual = Method.<String>isEqual(g1,g2);
        System.out.println(isEqual);

        int compareResult = Method.<Integer>compare(1,4);
        System.out.println(compareResult);
    }
}

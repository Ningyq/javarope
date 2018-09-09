package java1;

/**
 * Created by Coldwarm on 18/7/29.
 */
public class Gener {

    public static void main(String[] args) {
        String name = "nn";
        Object  obj;
        obj = name;
        System.out.println(obj);

        MyClass<String> myClass1 = new MyClass();
        MyClass<Object> myClass2 = new MyClass();

        obj=myClass1;
        System.out.println(obj);
    }

    private static class MyClass<T> {
        @Override
        public String toString() {
            return "MyClass{}";
        }
    }
}

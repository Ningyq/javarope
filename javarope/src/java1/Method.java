package java1;

public class Method {
    public static <T> boolean isEqual(GenericsClass1<T> g1, GenericsClass1<T> g2){
        return g1.getItem().equals(g2.getItem());
    }

    public static  <T extends Comparable<T>> int compare(T t1,T t2){
        return t1.compareTo(t2);
    }

    public static void main(String[] args) {
        GenericsClass1<String> g1 = new GenericsClass1<>();
        g1.setItem("xupt");
        GenericsClass1<String> g2 = new GenericsClass1<>();
        g2.setItem("xupt");

        boolean isEqual = Method.isEqual(g1,g2);
        System.out.println(isEqual);

        int compareResult = Method.<Integer>compare(1,4);
        System.out.println(compareResult);
    }
    public static class GenericsClass1<T> {
        private T item;

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

    }
}

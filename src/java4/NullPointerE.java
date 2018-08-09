package java4;

public class NullPointerE {
    @SuppressWarnings("null")

    public static void main(String[] args) {
        String string = null;
        System.out.println(string.toLowerCase());
    }
}

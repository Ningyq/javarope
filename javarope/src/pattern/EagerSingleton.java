package pattern;

class Singleton {
    private static final Singleton instance = new Singleton();
    private String paw = "I eat ren";

    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }

    public String getPaw() {
        return paw;
    }
}

public class EagerSingleton {
    public static void main(String[] args) {
        Singleton single = Singleton.getInstance();
        System.out.println(single.getPaw());
    }
}
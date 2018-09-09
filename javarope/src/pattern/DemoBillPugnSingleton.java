package pattern;

class BillPugnSingleton {
    private BillPugnSingleton() {}

    private static class SingletonHelper {
        private static final BillPugnSingleton INSTANCE =
                new BillPugnSingleton();
    }

    public static BillPugnSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

public class DemoBillPugnSingleton {
    public static void main(String[] args) {
        BillPugnSingleton instance = BillPugnSingleton.getInstance();
        System.out.println(instance);
        BillPugnSingleton instance2 = BillPugnSingleton.getInstance();
        System.out.println(instance2);
    }
}

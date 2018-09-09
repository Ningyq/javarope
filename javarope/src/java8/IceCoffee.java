package java8;

@FunctionalInterface
interface Coffee {
    void service(String shop, String name);
}

public class IceCoffee {
    public static void main(String[] args) {
        int size = 10;
        Coffee order = (shop, name) ->
                System.out.println(shop + " order: " + name + " size: " + size);

        Coffee order1 = new Coffee() {
            @Override
            public void service(String shop, String name) {
                System.out.println(shop + " order: " + name + " size: " + size);
            }
        };

        order.service("starbucks", "latte");
        order1.service("Huawei", "huawei");
    }
}

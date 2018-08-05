package java1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Coldwarm on 2018/8/1.
 */
class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}

class Products implements Iterable {

    private List<Product> grocery = null;

    public Products() {
        grocery = new ArrayList<>();
        grocery.add(new Product(1,"Iphone",8000));
        grocery.add(new Product(2,"Huawei",7000));
        grocery.add(new Product(3,"Xiaomi",6000));
        grocery.add(new Product(4,"Oppo",5000));
    }

    @Override
    public Iterator iterator() {
        return grocery.iterator();
    }
}

public class GroceryIterator {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Products grocery =new Products();



        grocery.forEach(product -> System.out.println(product));

//        for (Object product : grocery) {
//            System.out.println(product);
//        }
    }
}

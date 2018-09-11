package com.dharma.springmvc.serive;

import com.dharma.springmvc.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService implements IProductService {

    public static final AtomicLong counter = new AtomicLong();

    private static List<Product> products;

    static {
        products = initData();
    }

    private static List<Product> initData() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(counter.incrementAndGet(), "iphone", 9000.0, 500));
        products.add(new Product(counter.incrementAndGet(), "huawei", 7000.0, 400));
        products.add(new Product(counter.incrementAndGet(), "xiaomi", 8000.0, 300));
        products.add(new Product(counter.incrementAndGet(), "oppo", 4000.0, 200));
        products.add(new Product(counter.incrementAndGet(), "vivo", 3000.0, 100));

        return products;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Product getProduct(long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public boolean isProductExist(Product product) {
        for (Product product1 : products) {
            if (product1.getName().equalsIgnoreCase(product.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addProduct(Product product) {
        product.setId(counter.incrementAndGet());
        products.add(product);
    }

    @Override
    public void deleteProduct(Product product) {
        products.remove(product);
    }

    @Override
    public void updateProduct(Product product, Product product1) {
        product1.setPrice(product.getPrice());
        product1.setCount(product.getCount());
    }
}

package com.dharma.springmvc.serive;

import com.dharma.springmvc.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> getProducts();

    Product getProduct(long id);

    boolean isProductExist(Product product);

    void addProduct(Product product);

    void deleteProduct(Product product);

    void updateProduct(Product product, Product product1);
}

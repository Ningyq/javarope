package com.dharma.demosb.service;

import com.dharma.demosb.Dao.ProductJpaDap;
import com.dharma.demosb.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductJpaDap productJpaDap;

    public List<Product> getProducts() {
        return (List<Product>)productJpaDap.findAll();
    }

    public Product getById(int id) {
        return productJpaDap.findOne(id);
    }

    public List<Product> getProductsByName(String name) {
        return (List<Product>) productJpaDap.findByName(name);
    }

    public List<Product> findByNameAndPrice(String name, Double price) {
        return (List<Product>) productJpaDap.findByNameAndPrice(name, price);
    }

    public Product addProduct(String name, Double price) {
        return productJpaDap.save(new Product(name, price));
    }

    public Product updateProduct(Integer id, String name, Double price) {
        return productJpaDap.save(new Product(id, name, price));
    }

    public void deleteProduct(Integer id) {
        productJpaDap.delete(id);
    }
}

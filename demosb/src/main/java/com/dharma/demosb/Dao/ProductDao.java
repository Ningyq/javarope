package com.dharma.demosb.Dao;

import com.dharma.demosb.bean.Product;

import java.util.List;

public interface ProductDao {
    Product findById(int id);

    List<Product> findByName(String name);

    int insert(Product product);

    int update(Product product);

    int delete(int id);

    List<Product> findAll();
}

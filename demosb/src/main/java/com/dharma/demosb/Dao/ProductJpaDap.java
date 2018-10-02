package com.dharma.demosb.Dao;

import com.dharma.demosb.bean.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductJpaDap extends CrudRepository<Product, Integer> {
    List<Product> findByName(String name);

    List<Product> findByNameAndPrice(String name, Double price);
}

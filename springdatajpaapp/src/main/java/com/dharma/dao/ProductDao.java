package com.dharma.dao;

import com.dharma.jpa.ProductRepository;
import com.dharma.modal.Product;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductDao {

    @Autowired
    private ProductRepository repository;

    public Product getProduct(int id) {
        return repository.findOne(id);
    }
}

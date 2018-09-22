package com.dharma.spring.service;

import com.dharma.spring.model.Product;
import com.dharma.spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Transactional
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Transactional
    public Product getById(Long id) {
        return productRepository.findOne(id);
    }

    @Transactional
    public void deleteProduct(Long productId) {
        productRepository.delete(productId);
    }

    @Transactional
    public List<Product> getProductsByName(String name) {
        return productRepository.findByName(name);
    }

    @Transactional
    public void deleteProduct() {
        productRepository.deleteAll();
    }

    @Transactional
    public boolean updateProduct(Product product) {
        return productRepository.save(product) != null;
    }
}

package com.dharma.demosb.controller;

import com.dharma.demosb.bean.Product;
import com.dharma.demosb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping
    public List<Product> getAll() {
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) {
        return productService.getById(id);
    }

    @GetMapping("/name/{name}")
    public List<Product> getByName(@PathVariable String name) {
        return productService.getProductsByName(name);
    }

    @GetMapping("/name/{name}/{price}")
    public List<Product> getByName(@PathVariable String name, @PathVariable Double price) {
        return productService.findByNameAndPrice(name, price);
    }

    @PostMapping("/{name}/{price}")
    public Product addProduct(@PathVariable String name, @PathVariable Double price) {
        return productService.addProduct(name, price);
    }

    @PutMapping("/{id}/{name}/{price}")
    public Product updateProduct(
            @PathVariable Integer id,
            @PathVariable String name,
            @PathVariable Double price
    ) {
        return productService.updateProduct(id, name, price);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }
}

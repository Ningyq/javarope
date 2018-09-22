package com.dharma.spring.controller;

import com.dharma.spring.model.Product;
import com.dharma.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public @ResponseBody String welcome() {
        return "Welcome to Dharma Mall";
    }

    @GetMapping("/product")
    public @ResponseBody
    List<Product> getAll() {
        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public @ResponseBody
    Product getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @GetMapping("/product/name/{name}")
    public @ResponseBody
    List<Product> getByName(@PathVariable String name) {
        return productService.getProductsByName(name);
    }

    @DeleteMapping("/product/{id}")
    public HttpStatus deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return HttpStatus.NO_CONTENT;
    }

    @PostMapping("/product")
    public HttpStatus addProduct(@RequestBody Product product) {
        return productService.updateProduct(product) ?
                HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
    }
}



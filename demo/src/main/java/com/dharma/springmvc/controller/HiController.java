package com.dharma.springmvc.controller;

import com.dharma.springmvc.model.Product;
import com.dharma.springmvc.serive.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HiController {

    @Autowired
    IProductService productService;

    @GetMapping("/")
    public ResponseEntity<String> Hi(ModelMap model) {
        return new ResponseEntity<String>("first rest api", HttpStatus.OK);
    }

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getProducts() {

        List<Product> products = productService.getProducts();

        if (products.isEmpty()) {
            new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable long id) {

        System.out.println("Fetching Product which id " + id);
        Product product = productService.getProduct(id);

        if (product == null) {
            System.out.println("Fetching Product which id " + id + "not found");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<Void> createProduct(@RequestBody Product product) {

        System.out.println("Creating Product " + product.getName());

        if (productService.isProductExist(product)) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }

        productService.addProduct(product);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable long id, @RequestBody Product product) {

        System.out.println("Fetching Product which id = " + id);

        Product current = productService.getProduct(id);

        if (current == null) {
            System.out.println("Fetching Product which id = " + id + "not found");
            return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
        }

        productService.updateProduct(product, current);

        return new ResponseEntity<Product>(HttpStatus.OK);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable long id) {

        System.out.println("Fetching Product which id = " + id);

        Product deleteProduct = productService.getProduct(id);

        if (deleteProduct == null) {
            System.out.println("Fetching Product which id = " + id + "not found");
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }

        productService.deleteProduct(deleteProduct);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}

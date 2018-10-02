package com.dharma.demosb.controller;

import com.dharma.demosb.Dao.ProductDao;
import com.dharma.demosb.Dao.ProductDaoImpl;
import com.dharma.demosb.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    ProductDaoImpl productDao;

    @PostMapping(value = "/hello")
    public HashMap<String, Object> get(@RequestParam String name) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("action", "hello");
        map.put("name", name);

        logger.info(name + " said happy national day");

        return map;
    }

    @GetMapping("/product/get/{id}")
    public Product get(@PathVariable Integer id) {
        return productDao.findById(id);
    }

    @GetMapping("/product/get/name/{name}")
    public List<Product> getByName(@PathVariable String name) {
        return productDao.findByName(name);
    }

    @PostMapping("/product/add/{name}/{price}")
    public int insert(@PathVariable String name, @PathVariable Double price) {
        Product product = new Product(name, price);
        return productDao.insert(product);
    }

    @DeleteMapping("/product/{id}")
    public int delete(@PathVariable Integer id) {
        return productDao.delete(id);
    }

//    @DeleteMapping("/product/name/{name}")
//    public int delete(@PathVariable String name) {
//        List<Product> products = productDao.findByName(name);
//        return productDao.delete(product.getId());
//    }

    @GetMapping("/product")
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }
}

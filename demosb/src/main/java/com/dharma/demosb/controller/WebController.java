package com.dharma.demosb.controller;

import com.dharma.demosb.bean.Product;
import com.dharma.demosb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web")
public class WebController {

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public String index(ModelMap map) {
        map.put("title", "GUO QING KUAI LE");
        return "index";
    }

    @GetMapping("/upload")
    public String upload(ModelMap map) {
        return "upload";
    }

    @RequestMapping("/error")
    public void error(ModelMap map) {
        throw new RuntimeException("devision exception");
    }

    @GetMapping("/product")
    public String product(ModelMap map) {
        List<Product> products = productService.getProducts();
        map.put("products", products);
        return "product";
    }
}

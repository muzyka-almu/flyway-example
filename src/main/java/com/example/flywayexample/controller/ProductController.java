package com.example.flywayexample.controller;

import com.example.flywayexample.model.Product;
import com.example.flywayexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Iterable<Product> products() {
        return this.productService.getAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Product add(@RequestBody Product newProduct) {
        return this.productService.save(newProduct);
    }
}

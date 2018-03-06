package com.example.flywayexample.service;

import com.example.flywayexample.dao.ProductRepository;
import com.example.flywayexample.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getAll() {
        return this.productRepository.findAll();
    }

    public Product save(Product product) {
        return this.productRepository.save(product);
    }
}

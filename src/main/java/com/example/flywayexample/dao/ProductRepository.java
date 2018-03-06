package com.example.flywayexample.dao;

import com.example.flywayexample.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}

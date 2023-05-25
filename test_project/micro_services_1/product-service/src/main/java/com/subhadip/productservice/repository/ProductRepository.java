package com.subhadip.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.subhadip.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
    
}

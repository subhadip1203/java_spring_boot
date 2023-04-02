package com.subhadip.microservice1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.subhadip.microservice1.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
    
}

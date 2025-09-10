package com.example.productcatalogservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<com.example.productcatalogservice.model.Product, String> {

}

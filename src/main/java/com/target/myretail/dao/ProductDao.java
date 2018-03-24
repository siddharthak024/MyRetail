package com.target.myretail.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.target.myretail.model.Product;

public interface ProductDao extends MongoRepository<Product, String> {
}

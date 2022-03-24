package com.SpringRest.springRestAnswers.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.SpringRest.springRestAnswers.models.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {

}

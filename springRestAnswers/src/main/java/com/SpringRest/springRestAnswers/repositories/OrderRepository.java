package com.SpringRest.springRestAnswers.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.SpringRest.springRestAnswers.models.Order;


@Repository
public interface OrderRepository extends MongoRepository<Order, Long> {

}

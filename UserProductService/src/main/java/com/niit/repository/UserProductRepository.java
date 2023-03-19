package com.niit.repository;

import com.niit.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProductRepository extends MongoRepository<Customer,String> {

    Customer  findByEmail(String email);
}

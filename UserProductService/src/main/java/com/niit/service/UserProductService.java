package com.niit.service;

import com.niit.domain.Customer;
import com.niit.domain.Product;
import com.niit.exception.ProductNotFoundException;
import com.niit.exception.UserAlreadyExistsException;
import com.niit.exception.UserNotFoundException;

import java.util.List;

public interface UserProductService {

    Customer registerUser(Customer user) throws UserAlreadyExistsException;
    Customer saveUserProduct(Product product, String email) throws UserNotFoundException;

    Customer deleteUserProduct(String email, String productCode) throws UserNotFoundException, ProductNotFoundException;

    boolean deleteUserProduct1(String email, String productCode) throws UserNotFoundException, ProductNotFoundException;

    List<Product> getAllUserProduct(String email) throws UserNotFoundException;
    List<Product> getAllProductsAvailable(int inStock);
}

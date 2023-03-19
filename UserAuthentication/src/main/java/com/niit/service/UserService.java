package com.niit.service;

import com.niit.domain.User;
import com.niit.exception.InvalidCredentialsException;
import com.niit.exception.UserAlreadyExistsException;

public interface UserService {
    User saveUser(User user) throws UserAlreadyExistsException;
    //user name and pwd is in db ot not, if not save
    User findByEmailAndPassword(String email,String password) throws InvalidCredentialsException;
}

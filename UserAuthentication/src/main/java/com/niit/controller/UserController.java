package com.niit.controller;


import com.niit.domain.User;
import com.niit.exception.InvalidCredentialsException;
import com.niit.exception.UserAlreadyExistsException;
//import com.niit.security.SecurityTokenGenerator;
import com.niit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private UserService userService;
    //private SecurityTokenGenerator securityTokenGenerator;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
       // this.securityTokenGenerator = securityTokenGenerator;
    }
    @PostMapping("/user")
    public ResponseEntity<?> saveUser(@RequestBody User user) throws UserAlreadyExistsException {
       return new ResponseEntity<>(userService.saveUser(user),HttpStatus.CREATED);

     //   return new ResponseEntity<>("user successful",HttpStatus.OK);
    }
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User user) throws InvalidCredentialsException
    {
//        User retrievedUser = userService.findByEmailAndPassword(user.getEmail(),user.getPassword());
//
//        if(retrievedUser==null)
//        {
//            throw new InvalidCredentialsException();
//        }
       // Map<String,String> map = securityTokenGenerator.generateToken(user);
        return new ResponseEntity<>("login successful",HttpStatus.OK);
    }

}

package com.test.Ecommerce.controller;

import com.test.Ecommerce.model.User;
import com.test.Ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("users")
    public Iterable getAllUsers()
    {
        return userService.getAllUsers();
    }
    @PostMapping("user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}

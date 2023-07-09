package com.test.Ecommerce.service;

import com.test.Ecommerce.model.User;
import com.test.Ecommerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;


    public Iterable getAllUsers() {
        return userRepo.findAll();
    }

    public String addUser(User user) {
        userRepo.save(user);
        return "user added.";
    }
}

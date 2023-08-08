package com.example.FitCheck.controller;


import com.example.FitCheck.model.Login;
import com.example.FitCheck.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.FitCheck.Service.UserService;

@RestController
@RequestMapping("/") // Base URL mapping for all endpoints in this controller
public class UserController {
    @Autowired
    UserService service;

    // POST: adding a user
    @PostMapping("/createUser")
    public String addUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    // //PUT: updating attributes of a user
    // @PutMapping("/user/{password}")
    // public String updateUserPassword(@PathVariable User user) {
    //     return service.updateUser(user);
    // }

    //DELETE: removing user
    @DeleteMapping("/userDelete")
    public String removeUser(@PathVariable User user) {
        return service.saveUser(user);
    }

    //Getting a user to login
    @GetMapping("/userLogin")
    public User sayHello(@PathVariable Login login) {
        return service.Login(login);
    }

    @GetMapping("/sample")
    public User sample() {
        return service.sample();
    }

}

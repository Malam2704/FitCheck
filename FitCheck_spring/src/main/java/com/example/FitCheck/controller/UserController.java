package com.example.FitCheck.controller;


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
    public String addUser(@RequestBody User user1) {
        return service.saveUser(user1);
    }

    // //PUT: updating attributes of a user
    // @PutMapping("/user/{password}")
    // public String updateUserPassword(@PathVariable User user) {
    //     return service.updateUser(user);
    // }

    //DELETE: removing user
    @DeleteMapping("/userDelete/{user}")
    public String removeUser(@PathVariable int id) {
        return "Hello, " + id + "!";
    }

    //Getting a user to login
    @GetMapping("/userLogin/{username}/{password}")
    public User sayHello(@PathVariable String username, @PathVariable String password) {
        return service.Login(username, password);
    }

    @GetMapping("/sample")
    public User sample() {
        return service.sample();
    }

}

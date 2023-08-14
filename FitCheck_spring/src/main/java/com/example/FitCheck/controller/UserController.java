package com.example.FitCheck.controller;


import com.example.FitCheck.dto.UserRequest;
import com.example.FitCheck.model.Login;
import com.example.FitCheck.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.FitCheck.Service.UserService;

@RestController
@RequestMapping("/user") // Base URL mapping for all endpoints in this controller
@RequiredArgsConstructor
public class UserController {
    @Autowired
    UserService service;

    // POST: adding a user
    @PostMapping("/createuser")
    public void addUser(@RequestBody UserRequest user) {
         service.saveUser(user);
    }

    // //PUT: updating attributes of a user
    // @PutMapping("/user/{password}")
    // public String updateUserPassword(@PathVariable User user) {
    //     return service.updateUser(user);
    // }

    //DELETE: removing user
    @DeleteMapping("/userDelete")
    public void removeUser(@PathVariable UserRequest user) {
        service.saveUser(user);
    }

    //Getting a user to login
    @GetMapping("/userLogin")
    public void sayHello(@PathVariable Login login) {
        service.Login(login);
    }

    @GetMapping("/sample")
    public void sample() {
        service.sample();
    }

}

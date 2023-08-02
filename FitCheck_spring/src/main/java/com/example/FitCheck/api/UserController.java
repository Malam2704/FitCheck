package com.example.FitCheck.api;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/") // Base URL mapping for all endpoints in this controller
public class UserController {
    UserService service;


    // POST: adding a user
    @PostMapping("/user/{user}")
    public String addUser(@PathVariable User user) {
        return service.saveUser(user);
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

}

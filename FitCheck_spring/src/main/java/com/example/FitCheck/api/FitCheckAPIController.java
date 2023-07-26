package com.example.FitCheck.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/") // Base URL mapping for all endpoints in this controller
public class FitCheckAPIController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    // POST: initially adding clothing piece to the db (clothing attributes...)
    @PostMapping("/clothing")
    public String addClothing(@PathVariable String color) {
        return "Hello, " + color + "!";
    }

    //PUT: updating attributes of the clothing piece (id)
    @PutMapping("/clothing/{id}")
    public String updateClothing(@PathVariable String id) {
        return "Hello, " + id + "!";
    }

    //DELETE: removing clothing piece from db (id)
    @DeleteMapping("/clothing/{id}")
    public String removeClothing(@PathVariable String id) {
        return "Hello, " + id + "!";
    }

    // GET: getting clothing pieces from the db (id)
    @GetMapping("/clothing/{id}")
    public String getClothing(@PathVariable String id) {
        return "Hello, " + id + "!";
    }
    // Add more methods for other API endpoints as needed
}

package com.leonardo.example.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserDaoService service;

    @GetMapping(path = "/users")
    public List<User> retriveAllUsers() {
        return service.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User retriveUser(@PathVariable int id) {
        return service.findOne(id);
    }

    @PostMapping (path = "/users")
    public void createUser(@RequestBody User user) {
        User newUser = service.saveUser(user);
    }
}

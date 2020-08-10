package com.leonardo.example.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @PostMapping(path = "/users")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        User newUser = service.saveUser(user);
        URI path = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(newUser.getId()).toUri();
        return ResponseEntity.created(path).build();
    }
}

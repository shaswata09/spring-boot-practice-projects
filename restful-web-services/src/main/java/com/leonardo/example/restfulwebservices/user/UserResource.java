package com.leonardo.example.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserDaoService service;

    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        User user = service.findOne(id);
        if (null == user)
            throw new UserNotFoundException("id-" + id);
        return user;
    }

    @PostMapping(path = "/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
        User newUser = service.saveUser(user);
        URI path = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(newUser.getId()).toUri();
        return ResponseEntity.created(path).build();
    }

    @DeleteMapping(path = "/users/{id}")
    public User deleteUser(@PathVariable int id) {
        User deletedUser = service.deleteUserByID(id);
        if (null == deletedUser)
            throw new UserNotFoundException("id-" + id);
        return deletedUser;
    }
}
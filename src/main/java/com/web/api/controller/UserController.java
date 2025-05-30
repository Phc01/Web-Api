package com.web.api.controller;

import com.web.api.model.User;
import com.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> getUsers() {
        return repository.findAll();

    }

    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

    @PostMapping
    public void postUser(@RequestBody User user) {
        repository.save(user);
    }

    @PutMapping
    public void putUser(@RequestBody User user) {
        repository.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }
}

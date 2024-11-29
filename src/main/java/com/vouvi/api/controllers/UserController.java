package com.vouvi.api.controllers;

import com.vouvi.api.models.User;
import com.vouvi.api.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{username}")
    public User searchByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @GetMapping("/id")
    public User getById(@RequestParam int id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public User createNewUser(@RequestBody User newUser) {
        return userService.createNewUser(newUser);
    }
}
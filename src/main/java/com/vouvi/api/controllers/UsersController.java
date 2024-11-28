package com.vouvi.api.controllers;

import com.vouvi.api.models.Users;
import com.vouvi.api.repositories.VouviRepository;

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
public class UsersController {

    @Autowired
    private VouviRepository vouviRepository;

    @GetMapping("/")
    public List<Users> getUsers() {
        return vouviRepository.findAll();
    }

    @GetMapping("/{username}")
    public List<Users> searchByUsername(@PathVariable String username) {
        return vouviRepository.findByUsername(username);
    }

    @GetMapping("/id")
    public Users getById(@RequestParam int id) {
        return vouviRepository.findById(id).orElseThrow();
    }

    @PostMapping("/")
    public Users createNewUser(@RequestBody Users Attributes) {
        vouviRepository.save(Attributes);
        return Attributes;
    }
}
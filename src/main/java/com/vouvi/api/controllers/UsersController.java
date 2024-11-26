package com.vouvi.api.controllers;

import com.vouvi.api.models.Users;
import com.vouvi.api.repositories.VouviRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private VouviRepository vouviRepository;

    @GetMapping("/{id}")
    public Users getById(@PathVariable int id) {
        return vouviRepository.findById(id).orElseThrow();
    }

    @PostMapping("/post")
    public Users create(@RequestBody Users Attributes){
        vouviRepository.save(Attributes);
        return Attributes;
    }

    @GetMapping("/username/{username}")
    public List<Users> searchByUsername(@PathVariable String username) {
        return vouviRepository.findByUsername(username);
    }

}
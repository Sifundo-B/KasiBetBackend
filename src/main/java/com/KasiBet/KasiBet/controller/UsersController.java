package com.KasiBet.KasiBet.controller;

import com.KasiBet.KasiBet.entity.users;
import com.KasiBet.KasiBet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public users signup(@RequestBody users user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{email}")
    public users getUserByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    @GetMapping
    public List<users> getAllUsers() {
        return userService.findAll();
    }
}


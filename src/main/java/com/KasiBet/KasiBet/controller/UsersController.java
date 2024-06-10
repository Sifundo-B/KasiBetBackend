package com.KasiBet.KasiBet.controller;

import com.KasiBet.KasiBet.entity.Users;
import com.KasiBet.KasiBet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private IUserService userService;

    @PostMapping("/signup")
    public Users signup(@RequestBody Users user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{email}")
    public Users getUserByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.findAll();
    }

}


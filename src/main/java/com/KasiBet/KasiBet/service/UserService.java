package com.KasiBet.KasiBet.service;

import com.KasiBet.KasiBet.entity.users;
import com.KasiBet.KasiBet.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UsersRepository userRepository;

    public users saveUser(users user) {
        return userRepository.save(user);
    }

    public users findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<users> findAll() {
        return userRepository.findAll();
    }
}


package com.KasiBet.KasiBet.service;

import com.KasiBet.KasiBet.entity.Users;

import java.util.List;

public interface IUserService {
    Users saveUser(Users user);
    Users findByEmail(String email);
    List<Users> findAll();

}

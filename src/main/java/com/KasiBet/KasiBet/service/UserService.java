package com.KasiBet.KasiBet.service;

import com.KasiBet.KasiBet.entity.Users;
import com.KasiBet.KasiBet.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService, UserDetailsService {

    @Autowired
    private UsersRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList<>());
    }

    public Users saveUser(Users user) {
        return userRepository.save(user);
    }

    public Users findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<Users> findAll() {
        return userRepository.findAll();
    }
}

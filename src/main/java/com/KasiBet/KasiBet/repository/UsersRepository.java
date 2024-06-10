package com.KasiBet.KasiBet.repository;

import com.KasiBet.KasiBet.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByEmail(String email);
}


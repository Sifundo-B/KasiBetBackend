package com.KasiBet.KasiBet.repository;

import com.KasiBet.KasiBet.entity.users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<users, Long> {
    users findByEmail(String email);
}


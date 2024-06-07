package com.KasiBet.KasiBet.repository;

import com.KasiBet.KasiBet.entity.Event;
import com.KasiBet.KasiBet.entity.users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventsRepository extends JpaRepository <Event, Long> {
    Event findByName(String name);
}

package com.KasiBet.KasiBet.repository;

import com.KasiBet.KasiBet.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EventsRepository extends JpaRepository <Event, Long> {
    List<Event> findBySportId(Long sportId);
}

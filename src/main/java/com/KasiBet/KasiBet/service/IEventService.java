package com.KasiBet.KasiBet.service;

import com.KasiBet.KasiBet.entity.Event;

import java.util.List;

public interface IEventService {
    Event saveEvent(Event event);
    List<Event> findAll();
    List<Event> findBySport(Long sportId);

}

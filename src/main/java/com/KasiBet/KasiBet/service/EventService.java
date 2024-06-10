package com.KasiBet.KasiBet.service;

import com.KasiBet.KasiBet.entity.Event;
import com.KasiBet.KasiBet.repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements IEventService{
    @Autowired
    private EventsRepository eventRepository;

    @Override
    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    @Override
    public List<Event> findBySport(Long sportId) {
        return eventRepository.findBySportId(sportId);
    }

}

package com.KasiBet.KasiBet.controller;

import com.KasiBet.KasiBet.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.KasiBet.KasiBet.entity.Event;

import java.util.List;
@RestController
@RequestMapping("/api/events")
public class EventsController {
    @Autowired
    private IEventService eventService;

    @PostMapping
    public Event saveEvent(@RequestBody Event event) {
        return eventService.saveEvent(event);
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.findAll();
    }

    @GetMapping("/sport/{sportId}")
    public List<Event> getEventsBySport(@PathVariable Long sportId) {
        return eventService.findBySport(sportId);
    }
}

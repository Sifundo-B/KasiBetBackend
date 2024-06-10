package com.KasiBet.KasiBet.controller;

import com.KasiBet.KasiBet.entity.Sport;
import com.KasiBet.KasiBet.service.ISportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sports")
public class SportsController {
    @Autowired
    private ISportService sportService;

    @PostMapping
    public Sport saveSport(@RequestBody Sport sport) {
        return sportService.saveSport(sport);
    }

    @GetMapping
    public List<Sport> getAllSports() {
        return sportService.findAll();
    }

    @GetMapping("/{id}")
    public Sport getSportById(@PathVariable Long id) {
        return sportService.findById(id);
    }
}

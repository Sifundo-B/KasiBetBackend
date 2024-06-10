package com.KasiBet.KasiBet.controller;

import com.KasiBet.KasiBet.entity.Bet;
import com.KasiBet.KasiBet.service.IBetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bets")
public class BetsController {
    @Autowired
    private IBetService betService;

    @PostMapping("/place")
    public Bet placeBet(@RequestBody Bet bet) {
        return betService.placeBet(bet);
    }

    @GetMapping("/user/{userId}")
    public List<Bet> getBetsByUser(@PathVariable Long userId) {
        return betService.findByUser(userId);
    }

}

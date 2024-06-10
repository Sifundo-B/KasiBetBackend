package com.KasiBet.KasiBet.service;

import com.KasiBet.KasiBet.entity.Bet;
import com.KasiBet.KasiBet.repository.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BetService implements  IBetService {
    @Autowired
    private BetRepository betRepository;

    @Override
    public Bet placeBet(Bet bet) {
        return betRepository.save(bet);
    }

    @Override
    public List<Bet> findByUser(Long userId) {
        return betRepository.findByUserId(userId);
    }

}

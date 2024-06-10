package com.KasiBet.KasiBet.service;

import com.KasiBet.KasiBet.entity.Bet;

import java.util.List;

public interface IBetService {
    Bet placeBet(Bet bet);
    List<Bet> findByUser(Long userId);

}

package com.KasiBet.KasiBet.repository;

import com.KasiBet.KasiBet.entity.Bet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BetRepository  extends JpaRepository<Bet, Long> {
}

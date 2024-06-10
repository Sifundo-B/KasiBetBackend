package com.KasiBet.KasiBet.service;

import com.KasiBet.KasiBet.entity.Sport;
import com.KasiBet.KasiBet.repository.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SportService implements ISportService {
    @Autowired
    private SportRepository sportRepository;

    @Override
    public Sport saveSport(Sport sport) {
        return sportRepository.save(sport);
    }

    @Override
    public List<Sport> findAll() {
        return sportRepository.findAll();
    }

    @Override
    public Sport findById(Long id) {
        return sportRepository.findById(id).orElse(null);
    }

}

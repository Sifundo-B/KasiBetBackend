package com.KasiBet.KasiBet.service;

import com.KasiBet.KasiBet.entity.Sport;

import java.util.List;

public interface ISportService {
    Sport saveSport(Sport sport);
    List<Sport> findAll();
    Sport findById(Long id);



}

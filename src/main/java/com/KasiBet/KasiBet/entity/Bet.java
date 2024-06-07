package com.KasiBet.KasiBet.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private users users;
    @ManyToOne
    private Event event;
    private double amount;
    private double odds;
    private String status;

}

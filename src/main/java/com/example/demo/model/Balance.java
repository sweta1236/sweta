package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Balance")
public class Balance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "amount")
    private double amount;
    private String paymentMode;
    private String account;
}
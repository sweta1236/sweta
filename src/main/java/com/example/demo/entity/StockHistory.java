package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;

@Entity
@Getter
public class StockHistory {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long stockId;
    private String stockName;
    private BigDecimal stockPrice;
    private Date priceDate;
    
}

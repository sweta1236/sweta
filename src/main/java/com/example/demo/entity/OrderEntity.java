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
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;
	private Long userId;
	private String stockId;
	private BigDecimal numberOfUnits;
	private BigDecimal amount;
	private BigDecimal stockPrice;
	private Boolean successful;
	private Date submitTime;

}

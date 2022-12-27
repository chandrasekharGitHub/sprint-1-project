package com.spring.boot.demo.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
@Entity
@Table(name = "payments")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "check_number")
	private Long checkNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "payment_customernumber")
	private Customer customerLine;
	
	@Column(name = "payment_date")
	private Date paymentDate;
	
	@Column(name = "amount")
	private double amount;
}
*/

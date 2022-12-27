package com.spring.boot.demo.model;

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
@Table(name = "orderdetails")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_number")
	private Long orderNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderDetail_productCode")
	private Product productCode;
	
	@Column(name = "quantity_ordered")
	private int quantityOrdered;
	
	@Column(name = "price_each")
	private double priceEach;
	
	@Column(name = "order_line_number")
	private int orderLineNumber;
	
}
*/

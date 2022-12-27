package com.spring.boot.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_number")
	private Long customerNumber;
	
	@Column(name = "customer_name", nullable = false, length = 255)
	private String customerName;
	
	@Column(name = "contact_lastname", nullable = false, length = 255)
	private String contactLastName;
	
	@Column(name = "contact_firstname", nullable = false, length = 255)
	private String contactFirstName;
	
	@Column(name = "phone", nullable = false, length = 255)
	private String phone;
	
	@Column(name = "address_line1", nullable = false, length = 255)
	private String addressLine1;
	
	@Column(name = "address_line2", nullable = false, length = 255)
	private String addressLine2;
	
	@Column(name = "city", nullable = false, length = 255)
	private String city;
	
	@Column(name = "state", nullable = false, length = 255)
	private String state;
	
	@Column(name = "postal_code", nullable = false, length = 255)
	private String postalCode;
	
	@Column(name = "country", nullable = false, length = 255)
	private String country;
	
	@ManyToOne
	@JoinColumn(name = "employee_employeenumber")
	private Employee salesRepEmployeeNumber;
	
	@Column(name = "credit_limit")
	private Long creditLimit;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "payment_customernumber")
	private Payment payment;
	
	@OneToMany
	@JoinColumn(name = "customers_customernumber")
	private List<Order> orders;
	
}
*/

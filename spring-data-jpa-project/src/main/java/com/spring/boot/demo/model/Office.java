package com.spring.boot.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
@Entity
@Table(name = "offices")
public class Office {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "office_code")
	private Long officeCode;
	
	@Column(name = "city", nullable = false, length = 255)
	private String city;
	
	@Column(name = "phone", nullable = false, length = 255)
	private String phone;
	
	@Column(name = "address_line1", nullable = false, length = 255)
	private String addressLine1;
	
	@Column(name = "address_line2", nullable = false, length = 255)
	private String addressLine2;
	
	@Column(name = "state", nullable = false, length = 255)
	private String state;
	
	@Column(name = "country", nullable = false, length = 255)
	private String country;
	
	@Column(name = "postal_code", nullable = false, length = 255)
	private String postalCode;
	
	@Column(name = "teritory", nullable = false, length = 255)
	private String teritory;
	
	@OneToMany
	@JoinColumn(name = "office_officecode")
	private List<Employee> employee;
}
*/

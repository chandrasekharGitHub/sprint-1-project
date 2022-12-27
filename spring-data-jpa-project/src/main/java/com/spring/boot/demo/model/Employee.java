package com.spring.boot.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_number")
	private Long employeeNumber;
	
	@Column(name = "last_name", nullable = false, length = 255)
	private String lastName;
	
	@Column(name = "first_name", nullable = false, length = 255)
	private String firstName;
	
	@Column(name = "extension", nullable = false, length = 255)
	private String extension;
	
	@Column(name = "email", nullable = false, length = 255)
	private String email;
	
	@Column(name = "reports_to", nullable = true, length = 255)
	private String reportsTo;
	
	@Column(name = "job_title", nullable = false, length = 255)
	private String jobTitle;
	
	@ManyToOne
	@JoinColumn(name = "office_officecode")
	private Office officeCode;
	
	@OneToMany
	@JoinColumn(name = "employee_employeenumber")
	private List<Employee> employee;
}
*/

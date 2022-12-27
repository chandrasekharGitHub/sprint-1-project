package com.spring.boot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>  {	
}

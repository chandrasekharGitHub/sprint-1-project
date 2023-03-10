package com.spring.boot.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.demo.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long>  {	
	public List<Employee> getAllEmployees();
	
	public Optional<Employee> findById(Long id);
	
}

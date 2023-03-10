package com.spring.boot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

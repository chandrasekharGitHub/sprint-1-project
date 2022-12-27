package com.spring.boot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.demo.model.ProductLine;

@Repository
public interface ProductLineRepository extends JpaRepository<ProductLine, Long>{

	
	
}

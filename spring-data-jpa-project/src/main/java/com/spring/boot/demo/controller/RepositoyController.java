package com.spring.boot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.boot.demo.model.ProductLine;
import com.spring.boot.demo.repository.ProductLineRepository;

@Controller
public class RepositoyController {
	@Autowired
	private ProductLineDAO productLineDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	public void run() {
		//productLineDAO.addProductLines();
		productDAO.addProducts();
		
	}
}

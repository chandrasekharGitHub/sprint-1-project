package com.spring.boot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.boot.demo.model.ProductLine;
import com.spring.boot.demo.repository.ProductLineRepository;

@Controller
public class ProductLineDAO {
	
	@Autowired
	ProductLineRepository productLineRepository;
	
	public void addProductLines() {
		ProductLine pl1 = new ProductLine("The world famous co-operative dairy ‘Amul’ is"
				+ " one of the main features of Anand. Amul is the biggest dairy not"
				+ " only in India, but in Asia too.",
				"<ol>"
				+ "<li>Amul offers a plethora of product lines that are closely related"
				+ " but still different.</li>"
				+ "</ol>","D:\\Image of Project ANUD.jpg",null);
		
		ProductLine pl2 = new ProductLine("Gucci is an Italian fashion brand founded in"
				+ " 1921 by Guccio Gucci, making it one of the oldest Italian fashion"
				+ " brands in operation today. ",
				"<ol>"
				+ "<li>Their products are usually bespoke leather accessories, from"
				+ " handbags to shoes.</li>"
				+ "</ol>","D:\\Image of Project GUCCI.jpg",null);
		
		ProductLine pl3 = new ProductLine("Dell is an American technology company that"
				+ " develops, sells, repairs, and supports computers and related"
				+ " products and services and is owned by its parent company.",
				"<ol>"
				+"<li>Dell is a provider of desktop personal computers, software, and "
				+ "peripherals.</li>"
				+"</ol>", "D:\\Image of Project DELL.jpg", null);
		
		ProductLine pl4 = new ProductLine("Puma SE (Puma) is a sporting goods and"
				+ " equipment manufacturer that designs, develops, and markets"
				+ " footwear, apparel, and accessories for men, women, and children.",
				"<ol>"
				+ "<li> The company markets products under PUMA, stitched, and Cobra"
				+ " Golf brand names.</li>"
				+"</ol>","D:\\image of Project PUMA.jpg", null);
		
		productLineRepository.save(pl1);
		productLineRepository.save(pl2);
		productLineRepository.save(pl3);
		productLineRepository.save(pl4);
	}

}

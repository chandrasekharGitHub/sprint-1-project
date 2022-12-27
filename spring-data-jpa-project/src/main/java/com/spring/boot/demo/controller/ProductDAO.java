package com.spring.boot.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//import com.spring.boot.demo.model.Order;
import com.spring.boot.demo.model.Product;
import com.spring.boot.demo.model.ProductLine;
//import com.spring.boot.demo.repository.OrderRepository;
import com.spring.boot.demo.repository.ProductLineRepository;
import com.spring.boot.demo.repository.ProductRepository;

@Controller
public class ProductDAO {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductLineRepository productLineRepository;
	
	//@Autowired
	//private OrderRepository orderRepository;
	
	public void addProducts() {
		
		//ProductLine....
		
		
		
		//Order....
		
		//Order o1 = new Order(null, null, null, false, "", null, null);
		
		//Product....
		
		Product p1 = new  Product("Amul Protein Buttermilk", "Amul becomes World"
		 		+ "'s 8th Largest Milk Processor", "Vihaan Distributes","Amul Protein"
		 		+ " Buttermilk is refreshing milk based natural drink.",189L,
		 		40.08,40.08);
		 
		Product p2 = new Product("Gucci T-shirt", "Gucci leads the scale down of"
		 		+ " fashion seasons", "sounddeluxestore", "Gucci is Itallian company growing "
		 		+ "rapidly in fashions variety", 500L, 200.08, 125.00);
		 
		Product p3 = new Product("Dell Laptop", "Dell becomes world famous for"
		 		+ " gadgets", "Multi-Vendor", "Dell laptop is well known for better work",
		 		190L, 65.09, 80.90);
		 
		Product p4 = new Product("Puma Bag", "Free Size", "indiaMART", "Puma is"
		 		+ " well known for leathers and bags", 156L, 2000.08, 2529.07);
		 
		/*productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);*/
		
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		
		
		
		
		//productRepository.saveAll(products);
		
		ProductLine pl1 = new ProductLine("The world famous co-operative dairy ‘Amul’ is"
				+ " one of the main features of Anand. Amul is the biggest dairy not"
				+ " only in India, but in Asia too.",
				"<ol>"
				+ "<li>Amul offers a plethora of product lines that are closely related"
				+ " but still different.</li>"
				+ "</ol>","D:\\Image of Project ANUD.jpg",products);
		
		ProductLine pl2 = new ProductLine("Gucci is an Italian fashion brand founded in"
				+ " 1921 by Guccio Gucci, making it one of the oldest Italian fashion"
				+ " brands in operation today. ",
				"<ol>"
				+ "<li>Their products are usually bespoke leather accessories, from"
				+ " handbags to shoes.</li>"
				+ "</ol>","D:\\Image of Project GUCCI.jpg",products);
		
		ProductLine pl3 = new ProductLine("Dell is an American technology company that"
				+ " develops, sells, repairs, and supports computers and related"
				+ " products and services and is owned by its parent company.",
				"<ol>"
				+"<li>Dell is a provider of desktop personal computers, software, and "
				+ "peripherals.</li>"
				+"</ol>", "D:\\Image of Project DELL.jpg", products);
		
		ProductLine pl4 = new ProductLine("Puma SE (Puma) is a sporting goods and"
				+ " equipment manufacturer that designs, develops, and markets"
				+ " footwear, apparel, and accessories for men, women, and children.",
				"<ol>"
				+ "<li> The company markets products under PUMA, stitched, and Cobra"
				+ " Golf brand names.</li>"
				+"</ol>","D:\\image of Project PUMA.jpg", products);
		

		productLineRepository.save(pl1);
		productLineRepository.save(pl2);
		productLineRepository.save(pl3);
		productLineRepository.save(pl4);
		
		
		 
		
	}
}

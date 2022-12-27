package com.spring.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.boot.demo.controller.RepositoyController;

@SpringBootApplication
public class SpringDataJpaProjectApplication implements CommandLineRunner {

	@Autowired
	private RepositoyController repositoryController;
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repositoryController.run();
	}

}

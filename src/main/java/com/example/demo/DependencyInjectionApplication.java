package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bean.BeanA;

@SpringBootApplication
public class DependencyInjectionApplication {
	
	@Autowired
	private BeanA beanA;

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
	}
}

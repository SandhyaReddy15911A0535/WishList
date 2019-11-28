package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.cg.capStore.controller")
@ComponentScan("com.cg.capStore.dao")
@ComponentScan("com.cg.capStore.service")
@ComponentScan("com.cg.capStore.model")
@EntityScan(basePackages = {"com.cg.capStore.model"})
@SpringBootApplication
public class CapStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapStoreApplication.class, args);
	}

}

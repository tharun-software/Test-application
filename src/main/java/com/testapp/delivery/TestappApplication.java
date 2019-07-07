package com.testapp.delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.testapp.delivery.controllers.LoginController;

@SpringBootApplication
@ComponentScan(basePackages= {"com.testapp.delivery"})
public class TestappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestappApplication.class, args);   
		
	}

}

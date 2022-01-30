package com.adp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.adp.entity.Customer;

@SpringBootApplication
public class SpringbootMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcApplication.class, args);
	}

	@Bean(name = "testCustomerBean")
	public Customer customer() {
		return new Customer("testing", "test@abc.com");
	}
}

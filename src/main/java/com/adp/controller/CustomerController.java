package com.adp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.adp.entity.Customer;
import com.adp.repository.CustomerRepository;

@Controller
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	Customer customer;

	@GetMapping("/customers")
	public String getAllCustomers(ModelMap model) {
		model.put("customers", customerRepository.findAll());
		return "customers-list";
	}

	@GetMapping(value = "/customers/{id}")
	public String getCustomer(@PathVariable Integer id, ModelMap model) {
		model.put("customer", customerRepository.findById(id));
		System.out.println(customer);
		return "customer";
	}
}

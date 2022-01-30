package com.adp.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adp.repository.CustomerRepository;

@RestController
public class CustomerRestController {

	@Autowired
	CustomerRepository customerRepository;

	@GetMapping(value = "/rest-customers")
	public ResponseEntity getAllCustomers(ModelMap model) {
		return ResponseEntity.ok(customerRepository.findAll());
	}
}

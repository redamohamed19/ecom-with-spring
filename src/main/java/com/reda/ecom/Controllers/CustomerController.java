package com.reda.ecom.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reda.ecom.Services.CustomerService;
import com.reda.ecom.models.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@GetMapping
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}

}

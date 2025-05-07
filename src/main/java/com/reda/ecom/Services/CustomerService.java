package com.reda.ecom.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reda.ecom.models.Customer;
import com.reda.ecom.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository repository;

	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}

	public List<Customer> getCustomers() {
		return repository.findAll();
	}

}

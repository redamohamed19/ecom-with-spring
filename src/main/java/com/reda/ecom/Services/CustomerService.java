package com.reda.ecom.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reda.ecom.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired CustomerRepository customerRepository;

}

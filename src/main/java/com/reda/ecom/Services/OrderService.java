package com.reda.ecom.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reda.ecom.models.Order;
import com.reda.ecom.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository repository;

	public List<Order> getOrders() {
		return repository.findAll();
	}
}

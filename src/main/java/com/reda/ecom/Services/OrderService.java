package com.reda.ecom.Services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reda.ecom.Mappers.OrderMapper;
import com.reda.ecom.dto.request.OrderRequest;
import com.reda.ecom.models.Order;
import com.reda.ecom.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository repository;
	@Autowired
	OrderMapper mapper;

	public List<Order> getOrders() {
		return repository.findAll();
	}

	public Order saveOrder(OrderRequest orderRequest) {
		Order order = mapper.toOrder(orderRequest);
		order.setCreatedAt(LocalDateTime.now());
		return repository.save(order);
	}
}

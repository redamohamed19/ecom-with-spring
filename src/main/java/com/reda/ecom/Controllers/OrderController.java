package com.reda.ecom.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reda.ecom.Services.OrderService;
import com.reda.ecom.models.Order;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderService orderService;

	@GetMapping
	public List<Order> getOrders() {
		return orderService.getOrders();
	}

}

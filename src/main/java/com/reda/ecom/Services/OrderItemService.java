package com.reda.ecom.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reda.ecom.repositories.OrderItemRepository;

@Service
public class OrderItemService {
	@Autowired OrderItemRepository repository;
}

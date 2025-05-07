package com.reda.ecom.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reda.ecom.repositories.RestaurantRepository;

@Service
public class RestaurantService {
	@Autowired RestaurantRepository repository;
}

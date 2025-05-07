package com.reda.ecom.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reda.ecom.models.Restaurant;
import com.reda.ecom.repositories.RestaurantRepository;

@Service
public class RestaurantService {
	@Autowired
	RestaurantRepository repository;

	public Restaurant saveRestaurent(Restaurant restaurant) {
		return repository.save(restaurant);
	}

	public List<Restaurant> getRestaurants() {
		return repository.findAll();
	}
}

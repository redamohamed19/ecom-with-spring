package com.reda.ecom.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reda.ecom.Services.RestaurantService;
import com.reda.ecom.models.Restaurant;

@RestController
@RequestMapping("/restaurants")
public class RestaurentController {

	@Autowired
	RestaurantService restaurantService;

	@GetMapping
	public List<Restaurant> getRestaurants() {
		return restaurantService.getRestaurants();
	}

}

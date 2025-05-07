package com.reda.ecom;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;
import com.reda.ecom.Services.MenuItemService;
import com.reda.ecom.Services.RestaurantService;
import com.reda.ecom.models.MenuItem;
import com.reda.ecom.models.Restaurant;

@SpringBootApplication
public class EcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(RestaurantService restaurantService, MenuItemService menuItemService) {
		return Args -> {
			Faker faker = new Faker();

			Restaurant restaurant = Restaurant.builder().name(faker.book().title())
					.address(faker.address().streetAddress()).build();
			Restaurant restaurantResponseRestaurant = restaurantService.saveRestaurent(restaurant);
			for (int i = 0; i < 4; i++) {

				MenuItem menuItem = MenuItem.builder().name(faker.food().ingredient())
						.price(faker.number().numberBetween(5, 30)).restaurant(restaurantResponseRestaurant).build();
				menuItemService.saveMenuItem(menuItem);
			}

		};
	}

}

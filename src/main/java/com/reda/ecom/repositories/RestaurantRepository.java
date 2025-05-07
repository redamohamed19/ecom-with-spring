package com.reda.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reda.ecom.models.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

}

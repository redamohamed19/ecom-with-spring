package com.reda.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reda.ecom.models.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}

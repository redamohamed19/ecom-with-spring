package com.reda.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reda.ecom.models.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}

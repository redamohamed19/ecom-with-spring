package com.reda.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reda.ecom.models.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {

}

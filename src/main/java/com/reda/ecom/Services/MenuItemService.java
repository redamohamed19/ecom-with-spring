package com.reda.ecom.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reda.ecom.models.MenuItem;
import com.reda.ecom.repositories.MenuItemRepository;

@Service
public class MenuItemService {
	@Autowired
	MenuItemRepository repository;

	public MenuItem saveMenuItem(MenuItem menuItem) {
		return repository.save(menuItem);
	}

	public List<MenuItem> getMenuItems() {
		return repository.findAll();
	}
}

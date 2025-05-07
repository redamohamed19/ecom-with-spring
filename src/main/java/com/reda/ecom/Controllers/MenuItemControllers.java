package com.reda.ecom.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reda.ecom.Services.MenuItemService;
import com.reda.ecom.models.MenuItem;

@RestController
@RequestMapping("/menuItems")
public class MenuItemControllers {

	@Autowired
	MenuItemService menuItemService;

	@GetMapping
	public List<MenuItem> getItems() {
		return menuItemService.getMenuItems();
	}

}

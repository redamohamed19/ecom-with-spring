package com.reda.ecom.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Restaurant {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String address;
	
	@OneToMany(mappedBy = "restaurant")
	private List<MenuItem> menuItems;

}

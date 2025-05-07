package com.reda.ecom.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MenuItem {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private Integer price;
	
	@ManyToOne
	@JoinColumn(name = "restaurantId")
	private Restaurant restaurant;
	
	
}

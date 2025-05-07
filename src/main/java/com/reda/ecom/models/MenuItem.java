package com.reda.ecom.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SuperBuilder
public class MenuItem extends BaseEntity {


	
	private String name;
	
	private Integer price;
	
	@ManyToOne
	@JoinColumn(name = "restaurantId")
	private Restaurant restaurant;
	
	
}

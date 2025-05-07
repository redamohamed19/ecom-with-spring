package com.reda.ecom.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
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
	@JsonBackReference
	private Restaurant restaurant;

}

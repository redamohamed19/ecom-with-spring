package com.reda.ecom.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

	@OneToMany(mappedBy = "menuItem")
	@JsonIgnore
	private List<OrderItem> orderItems;

}

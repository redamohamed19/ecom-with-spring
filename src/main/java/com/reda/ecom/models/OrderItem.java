package com.reda.ecom.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem extends BaseEntity {

	private Integer quantity;

	@JsonBackReference
	@ManyToOne()
	@JoinColumn(name = "orderId")
	private Order order;

	@ManyToOne()
	@JoinColumn(name = "menuItemId")
	private MenuItem menuItem;
}

package com.reda.ecom.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem extends BaseEntity {


	
	private Integer quantity;
	
	@ManyToOne()
	@JoinColumn(name = "orderId")
	private Order order;
	
	@OneToOne()
	@JoinColumn(name = "menuItemId")
	private MenuItem menuItem;
}

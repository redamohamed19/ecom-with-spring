package com.reda.ecom.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "_order")
public class Order {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String status;
	
	@ManyToOne()
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	
	@OneToMany(mappedBy = "order")
	private List<OrderItem> orderItems;
	
	
	
	

}

package com.reda.ecom.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer extends BaseEntity {
	

	
	@Column(unique = true)
	private String userName;
	
	@Column(unique = true)
	private String email;
	
	@OneToMany(mappedBy = "customer")
	private List<Order> orders;
	

}

package com.reda.ecom.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder 

public class Restaurant extends BaseEntity {
	

	
	private String name;
	
	private String address;
	
	@OneToMany(mappedBy = "restaurant")
	private List<MenuItem> menuItems;

}

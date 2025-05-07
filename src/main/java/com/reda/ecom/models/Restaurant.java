package com.reda.ecom.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
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

	@JsonManagedReference
	@OneToMany(mappedBy = "restaurant")
	private List<MenuItem> menuItems;

}

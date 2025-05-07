package com.reda.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reda.ecom.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

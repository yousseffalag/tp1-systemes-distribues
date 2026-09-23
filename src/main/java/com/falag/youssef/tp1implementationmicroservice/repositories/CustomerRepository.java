package com.falag.youssef.tp1implementationmicroservice.repositories;

import com.falag.youssef.tp1implementationmicroservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;



public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}


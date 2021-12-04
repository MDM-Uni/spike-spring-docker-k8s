package com.example.spiketaass.repositories;

import com.example.spiketaass.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

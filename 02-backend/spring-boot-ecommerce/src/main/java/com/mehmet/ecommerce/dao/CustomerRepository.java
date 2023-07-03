package com.mehmet.ecommerce.dao;

import com.mehmet.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

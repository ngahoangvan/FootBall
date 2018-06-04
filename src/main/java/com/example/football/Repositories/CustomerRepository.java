package com.example.football.Repositories;

import com.example.football.Domains.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "select count(id_customer) from customers",nativeQuery = true)
    Long countCustomer();

    Iterable<Customer> findAllByDateContains(String date);

}

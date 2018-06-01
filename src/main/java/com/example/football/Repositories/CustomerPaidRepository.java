package com.example.football.Repositories;

import com.example.football.Domains.CustomersPaid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerPaidRepository extends JpaRepository<CustomersPaid, Integer> {

    @Query(value = "select sum(cost) from customers_paid",nativeQuery = true)
    Long sumPrice();
}

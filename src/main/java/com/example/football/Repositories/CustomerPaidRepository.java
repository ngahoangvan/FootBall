package com.example.football.Repositories;

import com.example.football.Domains.CustomersPaid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerPaidRepository extends JpaRepository<CustomersPaid, Integer> {
}

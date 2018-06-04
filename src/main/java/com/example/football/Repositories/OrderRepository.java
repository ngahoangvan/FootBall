package com.example.football.Repositories;

import com.example.football.Domains.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderRepository extends JpaRepository<Order, Integer>, PagingAndSortingRepository<Order, Integer>{

}

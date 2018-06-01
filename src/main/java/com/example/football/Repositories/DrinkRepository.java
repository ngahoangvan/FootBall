package com.example.football.Repositories;

import com.example.football.Domains.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DrinkRepository extends JpaRepository<Drink, Integer>{
    @Query(value = "select count(id_drink) from drinks",nativeQuery = true)
    Long countDrink();

}

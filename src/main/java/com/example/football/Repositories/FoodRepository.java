package com.example.football.Repositories;

import com.example.football.Domains.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FoodRepository extends JpaRepository<Food, Integer> {

    @Query(value = "select count(id_food) from foods",nativeQuery = true)
    Long countFood();
}

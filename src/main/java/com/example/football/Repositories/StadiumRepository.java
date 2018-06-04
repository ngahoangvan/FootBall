package com.example.football.Repositories;

import com.example.football.Domains.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface StadiumRepository extends JpaRepository<Stadium, Integer>,PagingAndSortingRepository<Stadium,Integer> {

    @Query(value = "SELECT DISTINCT stadium.id_stadium, stadium.address, stadium.name, stadium.something,\n" +
            "\t\t\t\tcustomers.id_customer, customers.cost, customers.date, customers.name,\n" +
            "                customers.phone_number, customers.time_start, customers.time_end, customers.something\n" +
            "FROM stadium join customer_put_stadium on stadium.id_stadium = customer_put_stadium.id_stadium\n" +
            "\t\tjoin customers on customer_put_stadium.id_customer = customers.id_customer\n" +
            "WHERE customers.date = :date", nativeQuery = true)
    Iterable<Stadium> findStadiumByDate(@Param("date")String date);


    @Query(value = "select * from stadium", nativeQuery = true)
    Iterable<Stadium> getAllStadium();


}

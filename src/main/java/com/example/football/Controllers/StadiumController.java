package com.example.football.Controllers;

import com.example.football.Domains.Stadium;
import com.example.football.Repositories.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/stadium")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class StadiumController {

    @Autowired
    private StadiumRepository stadiumRepository;

    @GetMapping()
    public Iterable<Stadium> getAllStadium(){
        return stadiumRepository.findAll(new Sort(Sort.Direction.ASC, "idStadium"));
    }

    @GetMapping("/{date}")
    public Iterable<Stadium> getCustomerByDate(@PathVariable String date){
      return stadiumRepository.findStadiumByDate(date);
    }

    @GetMapping("/all")
    public Iterable<Stadium> getStadiums(){
        return stadiumRepository.getAllStadium();
    }
}

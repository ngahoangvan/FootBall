package com.example.football.Controllers;

import com.example.football.Domains.Stadium;
import com.example.football.Repositories.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stadium")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class StadiumController {

    @Autowired
    private StadiumRepository stadiumRepository;

    @GetMapping()
    public Iterable<Stadium> getAllStadium(){
        return stadiumRepository.findAll();
    }
}

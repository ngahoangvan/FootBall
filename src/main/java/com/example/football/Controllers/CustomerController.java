package com.example.football.Controllers;

import com.example.football.Domains.Customer;
import com.example.football.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping()
    public Iterable<Customer> getAllStadium(){
        return customerRepository.findAll();
    }
}

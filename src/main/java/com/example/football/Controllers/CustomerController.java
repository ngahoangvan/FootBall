package com.example.football.Controllers;

import com.example.football.Domains.Customer;
import com.example.football.Domains.Order;
import com.example.football.Repositories.CustomerRepository;
import com.example.football.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/order")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping()
    public Iterable<Customer> getAllStadium(){
        return customerRepository.findAll(new Sort(Sort.Direction.ASC, "idCustomer"));
    }

    @GetMapping("/count")
    public Long getCountFood(){
        return customerRepository.countCustomer();
    }

    @GetMapping("/date/{date}")
    public Iterable<Customer> getCustomerByDate(@PathVariable String date){
        return customerRepository.findAllByDateContains(date);
    }

    @PostMapping("")
    public void createOrder(@RequestBody Customer customer){
        customerRepository.save(customer);
    }
}

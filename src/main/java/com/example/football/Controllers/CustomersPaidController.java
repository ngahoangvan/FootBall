package com.example.football.Controllers;

import com.example.football.Domains.CustomersPaid;
import com.example.football.Repositories.CustomerPaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customer")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CustomersPaidController {

    @Autowired
    private CustomerPaidRepository customerPaidRepository;

    @GetMapping()
    public Iterable<CustomersPaid> getAllCustomersPaid(){
        return customerPaidRepository.findAll();
    }

    @GetMapping("/sum")
    public Long getCountFood(){
        return customerPaidRepository.sumPrice();
    }

    @PostMapping("/new")
    public void createCustomersPaid(@RequestBody CustomersPaid food){
        customerPaidRepository.save(food);
    }

    @PutMapping("/update")
    public void updateCustomersPaid(@RequestBody CustomersPaid food){
        customerPaidRepository.save(food);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CustomersPaid> deleteCustomersPaid(@PathVariable int id){
        customerPaidRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

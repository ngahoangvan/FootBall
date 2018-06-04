package com.example.football.Controllers;

import com.example.football.Domains.Order;
import com.example.football.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/putOrder")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public Iterable<Order> getOrder(){
        return orderRepository.findAll();
    }

    @PostMapping
    public void createOrder(@RequestBody Order order){
        orderRepository.save(order);
    }
}

package com.example.football.Controllers;

import com.example.football.Domains.Drink;
import com.example.football.Repositories.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/drink")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class DrinkController {

    @Autowired
    private DrinkRepository drinkRepository;

    @GetMapping()
    public Iterable<Drink> getAllDrink(){
        return drinkRepository.findAll();
    }

    @PostMapping("/new")
    public void createDrink(@RequestBody Drink food){
        drinkRepository.save(food);
    }

    @PutMapping("/update")
    public void updateDrink(@RequestBody Drink food){
        drinkRepository.save(food);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Drink> deleteDrink(@PathVariable int id){
        drinkRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

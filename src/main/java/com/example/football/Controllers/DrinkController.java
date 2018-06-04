package com.example.football.Controllers;

import com.example.football.Domains.Drink;
import com.example.football.Repositories.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/drink")
@CrossOrigin(origins = "*")
public class DrinkController {

    @Autowired
    private DrinkRepository drinkRepository;

    @GetMapping()
    public Iterable<Drink> getAllDrink(){
        return drinkRepository.findAll(new Sort(Sort.Direction.ASC, "idDrink"));
    }

    @GetMapping("/{id}")
    public Optional<Drink> getOneDrink(@PathVariable int id){
        return drinkRepository.findById(id);
    }

    @GetMapping("/count")
    public Long getCountDrink(){
        return drinkRepository.countDrink();
    }

    @PostMapping("/new")
    public void createDrink(@RequestBody Drink drink){
        drinkRepository.save(drink);
    }

    @PutMapping("/update")
    public void updateDrink(@RequestBody Drink drink){
        drinkRepository.save(drink);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Drink> deleteDrink(@PathVariable int id){
        drinkRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

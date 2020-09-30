package com.satyam.resource;

import com.satyam.bean.Coffee;
import com.satyam.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoffeeResources {

    @Autowired
    private CoffeeService coffeeService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/coffees", produces = "application/json")
    public List<Coffee> getAllCoffee()
    {
       return coffeeService.getAllCoffee();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/coffeePrice/{id}", produces = "application/json")
    public double getCoffeePrice(@PathVariable int id)
    {
        return coffeeService.getCoffeePriceById(id);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/coffee/{id}", produces = "application/json")
    public Coffee getCoffeeById(@PathVariable int id)
    {
        return coffeeService.getCoffeeById(id);
    }
}

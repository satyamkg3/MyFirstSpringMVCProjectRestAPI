package com.satyam.resource;

import com.satyam.bean.Order;
import com.satyam.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderResources {
    @Autowired
    private OrderService orderService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/placeOrder/{id}/{id}/{id}/{id}", produces = "application/json")
    public double placeOrder(@PathVariable int coffeeid,@PathVariable int addonid,@PathVariable int sizeid,@PathVariable int couponid)
    {
        return orderService.calculateBill(coffeeid,addonid,sizeid,couponid);
    }

}

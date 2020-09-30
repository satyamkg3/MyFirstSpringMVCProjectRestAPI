package com.satyam.resource;

import com.satyam.bean.Discount;
import com.satyam.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscountResources {
    @Autowired
    private DiscountService discountService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/offers", produces = "application/json")
    public List<Discount> getAllDiscount()
    {
        return discountService.getAllCoupons();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/offerPrice/{id}", produces = "application/json")
    public double getDiscountPrice(@PathVariable int id)
    {
        return discountService.getDiscountPriceById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/offer/{id}", produces = "application/json")
    public Discount getDiscountById(@PathVariable int id)
    {
        return discountService.getCouponById(id);
    }
}

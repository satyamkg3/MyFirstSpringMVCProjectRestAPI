package com.satyam.resource;

import com.satyam.bean.AddOns;
import com.satyam.service.AddOnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddOnResources {
    @Autowired
    private AddOnService addOnService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/addons", produces = "application/json")
    public List<AddOns> getAllAddOns()
    {
        return addOnService.getAllAddOns();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/addonPrice/{id}", produces = "application/json")
    public double getAddOnPrice(@PathVariable int id)
    {
        return addOnService.getAddonPriceById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/addon/{id}", produces = "application/json")
    public AddOns getAddOnById(@PathVariable int id)
    {
       return addOnService.getAddOnById(id);
    }
}

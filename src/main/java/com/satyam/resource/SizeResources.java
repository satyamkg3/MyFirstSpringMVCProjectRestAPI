package com.satyam.resource;

import com.satyam.bean.Size;
import com.satyam.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SizeResources {
    @Autowired
    private SizeService sizeService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/size", produces = "application/json")
    public List<Size> getAllSize()
    {
        return sizeService.getAllSize();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/sizePrice/{id}", produces = "application/json")
    public double getSizeByPrice(@PathVariable int id)
    {
        return sizeService.getSizePriceById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/size/{id}", produces = "application/json")
    public Size getSizeById(@PathVariable int id)
    {
        return sizeService.getSizeById(id);
    }
}

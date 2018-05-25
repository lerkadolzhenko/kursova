package com.example.demo.controller;

import com.example.demo.model.Location;
import com.example.demo.service.location.impls.LocationServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")

public class LocationController {
    @Autowired
    LocationServiceimpl LocationService;

    @RequestMapping("/Location")
    public List<Location> showLocation()
    {
        return LocationService.getAll();
    }
}

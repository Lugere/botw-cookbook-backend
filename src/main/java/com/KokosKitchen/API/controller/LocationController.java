package com.KokosKitchen.API.controller;

import com.KokosKitchen.API.model.Location;
import com.KokosKitchen.API.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    LocationRepository mySqlRepository;

    @GetMapping("/locations")
    public List<Location> getAllLocations() {
        return mySqlRepository.findAll();
    }

    @GetMapping("/locations/{id}")
    public Location getLocation(@PathVariable("id") String id) {
        return mySqlRepository.findById(id).get();
    }

}

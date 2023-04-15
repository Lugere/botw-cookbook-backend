package com.KokosKitchen.API.controller;

import com.KokosKitchen.API.model.Region;
import com.KokosKitchen.API.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegionController {

    @Autowired
    RegionRepository mySqlRepository;

    @GetMapping("/regions")
    public List<Region> getAllRegions() { return mySqlRepository.findAll(); }

    @GetMapping("/regions/{id}")
    public Region getRegion(@PathVariable("id") String id) {
        return mySqlRepository.findById(id).get();
    }

    @GetMapping("/regions/{id}/label")
    public String getRegionLabel(@PathVariable("id") String id) {
        return mySqlRepository.findById(id).get().getLabel();
    }
}

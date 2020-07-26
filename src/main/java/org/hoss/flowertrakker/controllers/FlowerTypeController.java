package org.hoss.flowertrakker.controllers;

import org.hoss.flowertrakker.models.FlowerType;
import org.hoss.flowertrakker.repository.FlowerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flowerType")
public class FlowerTypeController {

    private FlowerTypeRepository repository;

    public FlowerTypeController(final FlowerTypeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all")
    public List<FlowerType> getFlowerType() {
        System.out.println("---> getting all entries");
        long size = repository.count();
        System.out.println("----> Found " + size);
        return (List<FlowerType>)repository.findAll();
    }

    
}

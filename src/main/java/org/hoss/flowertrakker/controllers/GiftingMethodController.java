package org.hoss.flowertrakker.controllers;

import org.hoss.flowertrakker.models.GiftingMethod;
import org.hoss.flowertrakker.repository.GiftingMethodRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/giftingMethod")
public class GiftingMethodController {

    private GiftingMethodRepository repository;

    public GiftingMethodController(final GiftingMethodRepository giftingMethodRepository) {
        this.repository = giftingMethodRepository;
    }

    @GetMapping("/all")
    public List<GiftingMethod> giftingMethodList() {
        List list = (List<GiftingMethod>) repository.findAll();
        System.out.println("===> found "+list.size());
        return (List<GiftingMethod>) list;
    }
}

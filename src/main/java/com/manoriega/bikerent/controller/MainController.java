package com.manoriega.bikerent.controller;

import com.manoriega.bikerent.service.BikeService;
import com.manoriega.bikerent.service.PersonService;
import com.manoriega.bikerent.service.PromoService;
import com.manoriega.bikerent.service.RentBikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private PromoService promoService;

    @Autowired
    private RentBikeService rentBikeService;

    @Autowired
    private PersonService personService;

    @Autowired
    private BikeService bikeService;

    @GetMapping("/")
    public String getIndex(Model model) {
        return "index";
    }

    @GetMapping("/person")
    public String getPerson(Model model) {
        model.addAttribute("person", personService.findAllPerson());
        return "person";
    }

    @GetMapping("/bike")
    public String getBike(Model model) {
        model.addAttribute("bike", bikeService.getAll());
        return "bike";
    }

    @GetMapping("/promo")
    public String getPromo(Model model) {
        model.addAttribute("promo", promoService.getAllPromo());
        return "promo";
    }
}

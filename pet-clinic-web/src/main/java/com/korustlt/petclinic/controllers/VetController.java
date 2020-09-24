package com.korustlt.petclinic.controllers;

import com.korustlt.petclinic.sevices.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"}) // это все будет соответствовать index.html
    public String listVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index"; // find in templates/vets/index.html
    }
}

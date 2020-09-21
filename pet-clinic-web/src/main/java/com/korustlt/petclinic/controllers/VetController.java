package com.korustlt.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"}) // это все будет соответствовать index.html
    public String listVets() {
        return "vets/index"; // find in templates/vets/index.html
    }
}

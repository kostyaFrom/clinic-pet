package com.korustlt.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners"})
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"}) // это все будет соответствовать index.html
    public String listOwners() {
        return "owners/index"; // find in templates/owners/index.html
    }
}

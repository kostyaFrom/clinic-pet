package com.korustlt.petclinic.controllers;

import com.korustlt.petclinic.sevices.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners"})
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"}) // это все будет соответствовать index.html
    public String listOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index"; // return templates/owners/index.html
    }

    @RequestMapping("/find")
    public String findOwners() {
        return "notimplemented";
    }
}

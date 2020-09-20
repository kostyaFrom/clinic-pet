package com.korustlt.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"}) // это все будет соответствовать index.html
    public String index() {
        return "index"; // return index.html
    }
}

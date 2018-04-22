package com.dex.controllers;

import com.dex.model.OpisPromene;
import com.dex.services.OpisPromeneService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OpisPromeneController {

    private final OpisPromeneService opisPromeneService;

    public OpisPromeneController(OpisPromeneService opisPromeneService) {
        this.opisPromeneService = opisPromeneService;
    }

    @GetMapping
    @RequestMapping({"/opispromena"})
    public String getOpisPromene(Model model){
        model.addAttribute("opisipromenalist",opisPromeneService.vratiListuOpisaPromena());
        return "opispromena/opisipromenalist";
    }

    @GetMapping
    @RequestMapping("/opispromena/novi")
    public String kreirajNovi(Model model) {
        model.addAttribute("noviOpisPromene", new OpisPromene());
        return "opispromena/opispromenaform";
    }

    @PostMapping
    @RequestMapping("opispromenanew")
    public String sacuvaj(@ModelAttribute OpisPromene opisPromene){
        opisPromeneService.kreirajNovi(opisPromene);
        return "redirect:/opispromena";
    }
}

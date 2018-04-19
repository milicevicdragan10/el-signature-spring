package com.dex.controllers;

import com.dex.services.OpisPromeneService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OpisPromeneController {

    private final OpisPromeneService opisPromeneService;

    public OpisPromeneController(OpisPromeneService opisPromeneService) {
        this.opisPromeneService = opisPromeneService;
    }

    @RequestMapping({"/opispromena"})
    public String getOpisPromene(Model model){
        model.addAttribute("opisipromenalist",opisPromeneService.vratiListuOpisaPromena());
        return "opispromena/opisipromenalist";
    }
}

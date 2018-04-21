package com.dex.controllers;


import com.dex.services.KontniOkvirService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KontniOkvirController {

    private final KontniOkvirService kontniOkvirService;

    public KontniOkvirController(KontniOkvirService kontniOkvirService) {
        this.kontniOkvirService = kontniOkvirService;
    }

    @RequestMapping({"/kontniokvir"})
    public String getKontniOkvir (Model model){
        model.addAttribute("kontniokvirlist",kontniOkvirService.vratiListuKontnihOkvira());
        return "kontniokvir/kontniokvirlist";
    }
}

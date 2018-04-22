package com.dex.controllers;


import com.dex.model.KontniOkvir;
import com.dex.services.KontniOkvirService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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

    @GetMapping
    @RequestMapping("/kontniokvir/noviKO")
    public String kreirajNoviKO(Model model) {
        model.addAttribute("noviKontniOkvir", new KontniOkvir());
        return "kontniokvir/kontniokvirform";
    }

    @PostMapping
    @RequestMapping("kontniokvirnew")
    public String sacuvajKO(@ModelAttribute KontniOkvir kontniOkvir){
        kontniOkvirService.kreirajNoviKO(kontniOkvir);
        return "redirect:/kontniokvir";
    }
}

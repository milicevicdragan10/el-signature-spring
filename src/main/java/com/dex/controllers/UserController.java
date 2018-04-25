package com.dex.controllers;

import com.dex.model.User;
import com.dex.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @RequestMapping("/")
    public String inicijalizuj(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping
    @RequestMapping("logovanje")
    public String ulogujSe(@ModelAttribute User user){
        User loggedUser=userService.findUserByCredentials(user);
        return "redirect:/opispromena";
    }
}

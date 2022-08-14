package com.adventureoutdoors.AdventureOutdoors.controllers;

import com.adventureoutdoors.AdventureOutdoors.models.User;
//import com.adventureoutdoors.AdventureOutdoors.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;


@Controller
public class UserController {


//    private UserRepository userRepository;

    @GetMapping("register")
    public String displayRegistrationForm(Model model) {
        model.addAttribute(new User());
        return "register";
    }

    @PostMapping("register")
    public String processRegistrationForm(String verify, @ModelAttribute @Valid User user,
                                          Errors errors, Model model) {
        if (errors.hasErrors() || !(user.getPassword().equals(verify))) {
            return "register";
        }
       // userRepository.save(user);
        return "redirect:";
    }

    @GetMapping("login")
    public String displayLoginPage(Model model) {
        return "login";
    }

    @PostMapping("login")
    public String processLoginPage(Model model) {
        return "redirect:";
    }




}
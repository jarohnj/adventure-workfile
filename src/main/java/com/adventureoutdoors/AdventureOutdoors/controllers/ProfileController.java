//package com.adventureoutdoors.AdventureOutdoors.controllers;
//
//import com.adventureoutdoors.AdventureOutdoors.models.User;
//import com.adventureoutdoors.AdventureOutdoors.models.data.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.Optional;
//
//@Controller
//@RequestMapping("profile")
//public class ProfileController {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @GetMapping("")
//    public String displayViewProfile(Model model, @PathVariable int userId) {
//
//        Optional optUser = userRepository.findById(userId);
//        if (optUser.isPresent()) {
//            User user = (User) optUser.get();
//
////        model.addAttribute("user", user);
////            return "";
////        } else {
////            return "";
////        }
//        }
//
//        @GetMapping("/edit/{userId}")
//        public String displayEditProfile(Model model, @PathVariable int userId) {
//            User user = UserRepository.findById(userId)
//                    .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + userId));
//
//            model.addAttribute("user", user);
//            return "update-user";
//
//        }
//
//        @PostMapping("/edit/{userId}")
//        public String processEditProfile(@ModelAttribute @Valid User user,
//                Errors errors, Model model) {
//            if (errors.hasErrors()) {
//                //return "employers/add";
//            }
//            UserRepository.save(user);
//            return "redirect:";
//        }
//    }
//}

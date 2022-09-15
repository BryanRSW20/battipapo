package com.battipapo.controller;

import com.battipapo.model.User;
import com.battipapo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/add")
    public String add(Model model){
        model.addAttribute("user", new User());
        return "user/add";
    }

    @PostMapping("/user/save")
    public String save(User user, Model model){
        try {
            userService.save(user);
            model.addAttribute("user", user);
            model.addAttribute("isSaved", true);
            return "user/add";
        } catch(Exception e){
            model.addAttribute("user", user);
            model.addAttribute("isError", true);
            model.addAttribute("error", e.getMessage());
            return "user/add";
        }
    }
}

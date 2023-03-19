package com.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.billing.UserRepository;

@Controller
public class BillingController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

  
    @PostMapping("/login")
    public String submitLoginForm(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        if (username.equals("admin") && password.equals("password")) {
            return "redirect:/dashboard";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}

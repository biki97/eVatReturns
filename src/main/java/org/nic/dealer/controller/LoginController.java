package org.nic.dealer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    // Handle login form submission
    @GetMapping("/login")
    public String login() {
        // Perform authentication logic here

        // If authentication is successful, redirect to the user_list page
        return "redirect:/user_list";
    }
}


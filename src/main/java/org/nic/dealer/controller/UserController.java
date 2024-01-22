package org.nic.dealer.controller;

import org.nic.dealer.repository.publicUser;
import org.nic.dealer.repository.publicUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private publicUserRepo userRepository;

    @GetMapping("/user_list")
    public String getUserList(Model model) {
        List<publicUser> users = userRepository.findAll();
        model.addAttribute("users", users);

        return "user_list";
    }


}

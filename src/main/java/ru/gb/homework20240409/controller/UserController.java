package ru.gb.homework20240409.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.homework20240409.model.User;
import ru.gb.homework20240409.repository.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String getUsers(Model model)
    {
        model.addAttribute("users", userRepository.getUsers());
        return "users";
    }

    @GetMapping("/add")
    public String addUserForm(Model model) {
        model.addAttribute("count", userRepository.getUsers().size());
        return "adduser";
    }

    @PostMapping
    public String addProduct(User u)
    {
        userRepository.addUser(u);
        return "redirect:users";
    }

}

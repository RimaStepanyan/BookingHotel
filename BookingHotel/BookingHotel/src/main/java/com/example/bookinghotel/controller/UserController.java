package com.example.bookinghotel.controller;


import com.example.bookinghotel.entity.User;
import com.example.bookinghotel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public String users(ModelMap modelMap) {
        List<User> all = userRepository.findAll();
        modelMap.addAttribute("users", all);
        return "users";
    }

    @GetMapping("/users/add")
    public String addUserPage(){
        return "addUser";
    }

    @PostMapping("/users/add")
    public String addUser(@RequestParam(name = "name") String name,
                          @RequestParam(name = "surname") String surname,
                          @RequestParam(name = "email")String email,
                          @RequestParam(name = "phone") int phone){
        User user = User.builder()
                .name(name)
                .surname(surname)
                .email(email)
                .phone(phone)
                .build();
        userRepository.save(user);

        return "redirect:/users";
    }
}

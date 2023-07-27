package com.ehome2u.ems.controller;

import com.ehome2u.ems.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("users")
public class UsersController {

    @Autowired
    UserServiceImpl mUserServiceImpl;

    @GetMapping
   public String index(Model model){
        model.addAttribute("list", mUserServiceImpl.getAll());
       return "users/index";
   }

}

package com.ehome2u.ems.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {
    @RequestMapping(value={"/","/login"}, method = RequestMethod.GET)
    public String login() {
        //BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        //String encodedPassword = passwordEncoder.encode("mrs505");
        //$2a$10$5x/bsMsGINLHnnddMKsCUePkxqFOjBGcgox3tapLTrFIMNNCmcEaa$2a$10$7R32nHxvDzNO9gmkODu2Kudw80Nv.TyjYS2pCjzMQazjDvFuWoDiy
       //System.out.print(encodedPassword);
        return "login";
    }

}

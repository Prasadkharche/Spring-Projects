package com.passwordgenerator.password.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.passwordgenerator.password.entity.user;
import com.passwordgenerator.password.service.userService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/controller")
public class userController {

    @Autowired
    private userService userservice;

    @PostMapping("/adduser")
    public String postMethodName(@RequestBody user user) {
        return userservice.adddata(user);
    }

    @GetMapping("/getpassword")
    public String getMethodName(@RequestParam("id") Long id) {
        return userservice.getPassword(id);
    }
    
    
}

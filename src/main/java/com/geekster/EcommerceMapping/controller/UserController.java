package com.geekster.EcommerceMapping.controller;

import com.geekster.EcommerceMapping.model.User;
import com.geekster.EcommerceMapping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //Create Users
    @PostMapping("addUsers")
    public String addUsers(@RequestBody User newUser){
        return userService.addUser(newUser);
    }

    //Get User by User ID :
    @GetMapping("getUser/{uId}")
    public User getUser(@PathVariable Integer uId){
        return userService.getUser(uId);
    }
}

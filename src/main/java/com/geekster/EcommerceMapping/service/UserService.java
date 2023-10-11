package com.geekster.EcommerceMapping.service;

import com.geekster.EcommerceMapping.model.User;
import com.geekster.EcommerceMapping.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    //Create User
    public String addUser(User newUser) {
        userRepo.save(newUser);
        return newUser.getUName()+ " user added!";
    }

    //Get User by User ID :
    public User getUser(Integer uId) {
        return userRepo.findById(uId).get();
    }
}

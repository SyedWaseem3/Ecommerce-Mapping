package com.geekster.EcommerceMapping.controller;

import com.geekster.EcommerceMapping.model.Address;
import com.geekster.EcommerceMapping.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    //Create Address
    @PostMapping("addAddress")
    public String addAddress(@RequestBody Address newAddress){
        return addressService.addAddress(newAddress);
    }
}

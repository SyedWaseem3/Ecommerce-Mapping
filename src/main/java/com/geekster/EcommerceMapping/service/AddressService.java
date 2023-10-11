package com.geekster.EcommerceMapping.service;

import com.geekster.EcommerceMapping.model.Address;
import com.geekster.EcommerceMapping.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    //Create Address
    public String addAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return newAddress.getAName()+ " address added!";
    }
}

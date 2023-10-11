package com.geekster.EcommerceMapping.service;

import com.geekster.EcommerceMapping.model.ProdOrder;
import com.geekster.EcommerceMapping.repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;

    //Create Order
    public String addOrder(ProdOrder newProdOrder) {
        orderRepo.save(newProdOrder);
        return "An order has been has!!!";
    }

    //Get order by Order ID :
    public ProdOrder getOrder(Integer oId) {
        return orderRepo.findById(oId).get();
    }
}

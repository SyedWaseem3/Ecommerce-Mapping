package com.geekster.EcommerceMapping.controller;

import com.geekster.EcommerceMapping.model.ProdOrder;
import com.geekster.EcommerceMapping.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    //Create Order
    @PostMapping("addOrder")
    public String addOrder(@RequestBody ProdOrder newProdOrder){
        return orderService.addOrder(newProdOrder);
    }

    //Get order by Order ID :
    @GetMapping("getOrder/{oId}")
    public ProdOrder getOrder(@PathVariable Integer oId){
        return orderService.getOrder(oId);
    }
}

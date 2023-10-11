package com.geekster.EcommerceMapping.controller;

import com.geekster.EcommerceMapping.model.Category;
import com.geekster.EcommerceMapping.model.Product;
import com.geekster.EcommerceMapping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    //Create Product
    @PostMapping("addProduct")
    public String addProduct(@RequestBody Product newProduct){
        return productService.addProduct(newProduct);
    }

    //Get all Products
    @GetMapping("getAllProducts")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    //Get Products by category
    @GetMapping("getProductByCategory/category/{category}")
    public List<Product> getProductByCategory(@PathVariable Category category){
        return productService.getProductByCategory(category);
    }

    //Delete Products by Product ID :
    @DeleteMapping("deleteProductById/{id}")
    public String deleteProductById(@PathVariable Integer id){
        return productService.deleteProductById(id);
    }

}

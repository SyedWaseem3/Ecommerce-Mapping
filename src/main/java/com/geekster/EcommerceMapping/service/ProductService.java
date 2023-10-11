package com.geekster.EcommerceMapping.service;

import com.geekster.EcommerceMapping.model.Category;
import com.geekster.EcommerceMapping.model.Product;
import com.geekster.EcommerceMapping.repo.IProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;

    //Create Product
    public String addProduct(Product newProduct) {
        productRepo.save(newProduct);
        return newProduct.getPName()+ " product added!";
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    //Get Products by category
    @Transactional
    public List<Product> getProductByCategory(Category category) {
        return productRepo.getProductByCategory(category.name());
    }

    //Delete Products by Product ID :
    public String deleteProductById(Integer id) {
        Product myProduct = productRepo.findById(id).get();
        productRepo.delete(myProduct);
        return myProduct.getPName()+ " product has been deleted!";
    }
}

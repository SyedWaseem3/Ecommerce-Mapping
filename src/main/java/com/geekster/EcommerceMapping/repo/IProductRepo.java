package com.geekster.EcommerceMapping.repo;

import com.geekster.EcommerceMapping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {

    @Modifying
    @Query(value = "SELECT * FROM PRODUCT WHERE P_CATEGORY = :name", nativeQuery = true)
    List<Product> getProductByCategory(String name);
}

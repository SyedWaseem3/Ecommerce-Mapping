package com.geekster.EcommerceMapping.repo;

import com.geekster.EcommerceMapping.model.ProdOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<ProdOrder, Integer> {
}

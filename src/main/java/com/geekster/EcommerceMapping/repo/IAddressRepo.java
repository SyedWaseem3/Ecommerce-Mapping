package com.geekster.EcommerceMapping.repo;

import com.geekster.EcommerceMapping.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Integer> {
}

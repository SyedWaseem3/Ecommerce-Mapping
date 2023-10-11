package com.geekster.EcommerceMapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProdOrder {
    @Id
    private Integer oId;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;

    @OneToMany
    @JoinColumn(name = "fk_order")
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "fk_order_id")
    private Address address;

    private Integer oQuantity;
}

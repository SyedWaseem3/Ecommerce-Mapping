package com.geekster.EcommerceMapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    private Integer pId;
    private String pName;
    private Integer pPrice;
    private String pDescription;
    @Enumerated(EnumType.STRING)
    private Category pCategory;
    private String pBrand;
}

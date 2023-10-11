package com.geekster.EcommerceMapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    private Integer aId;
    private String aName;
    private String aNumber;
    private String aZipcode;
    private String aState;

    @OneToOne
    @JoinColumn(name = "fk_user_id")
    private User user;
}

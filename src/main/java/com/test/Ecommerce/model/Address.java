package com.test.Ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Address {
    @Id
    private Integer addId;
    private  String addName;
    private  String landmark;
    private String phoneNumber;
    private String zipCode;
    @OneToOne
    User user;

}

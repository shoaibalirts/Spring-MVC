package com.namenets.WebProject.model;

import lombok.AllArgsConstructor;
import lombok.Data; // it contains all getters and setters as well as constructors

@Data
@AllArgsConstructor
public class Product {
    private int prodId;
    private String prodName;
    private int price;
}

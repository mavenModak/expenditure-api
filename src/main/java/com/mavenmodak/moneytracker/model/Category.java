package com.mavenmodak.moneytracker.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    private Integer categoryId;
    private Integer userId;
    private String title;
    private String description;
    private Double totalCost;

}

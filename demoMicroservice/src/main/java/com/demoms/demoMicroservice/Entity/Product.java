package com.demoms.demoMicroservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Product{

   @Id
    private long id;
    private String name;
    private Double price;
}

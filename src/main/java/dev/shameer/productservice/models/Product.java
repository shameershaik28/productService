package dev.shameer.productservice.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int id;

    private String name;

    private String title;

    private String description;

    private double price;

    private String imageURL;
}

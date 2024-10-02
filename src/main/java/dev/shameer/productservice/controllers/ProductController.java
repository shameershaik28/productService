package dev.shameer.productservice.controllers;

import dev.shameer.productservice.models.Product;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProductController {

    @PostMapping("/products")
    public void createProduct() {

    }
    @GetMapping("/product/{id}")
    public Product getProductDetails(@PathVariable("id") int id) {
         return new Product();
    }
    @GetMapping("/products")
    public void getAllProducts() {

    }

    public void updateProduct() {

    }

}

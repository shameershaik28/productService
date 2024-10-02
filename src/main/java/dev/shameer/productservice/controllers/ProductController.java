package dev.shameer.productservice.controllers;

import dev.shameer.productservice.models.Product;
import dev.shameer.productservice.services.FakeStoreProductService;
import dev.shameer.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProductController {

    ProductService productService;

    public ProductController(@Qualifier("fakestore") ProductService productService) {
        this.productService = productService;
    }


    @PostMapping("/products")
    public void createProduct() {

    }
    @GetMapping("/product/{id}")
    public Product getProductDetails(@PathVariable("id") int id) {
        return productService.getSingleProduct(id );

    }
    @GetMapping("/products")
    public void getAllProducts() {

    }

    public void updateProduct() {

    }

}

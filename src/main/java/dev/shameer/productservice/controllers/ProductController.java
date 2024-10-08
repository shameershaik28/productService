package dev.shameer.productservice.controllers;

import dev.shameer.productservice.dtos.RequestBodyProductDto;
import dev.shameer.productservice.models.Product;
import dev.shameer.productservice.services.FakeStoreProductService;
import dev.shameer.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    /*
    ProductService productService
     */
    /*
    POST /products/
    Request body
    {
        "id" :
        "title:
        "descr":
        "category":
        "price"
     }
     */
    ProductService productService;
    public ProductController(@Qualifier("selfproductservice") ProductService productService){
        this.productService = productService;
    }
    /*
    Qualifier is used to identify the depedency to be injected here
     */
    @PostMapping("/products")
    public Product createProduct(@RequestBody RequestBodyProductDto request){
        return productService.createProduct(request.getTitle(),
                request.getDescription(),
                request.getPrice(),
                request.getCategory(),
                request.getImage());
    }

    // /product/1 - get details of a particular product
    /*
    id:
    title:
    price:
     */
    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long id){
        /*
        1 - > directly make a call fakestore api
        2 - > productService.getProductDetails()
         */
        return productService.getSingleProduct(id);
    }

    @GetMapping("/products")
    public void getAllProducts(){
    }


    public void updateProduct(){

    }
}



/*
Every api call at the end of the day is a method call inside a controller
 */
package dev.shameer.productservice.services;

import dev.shameer.productservice.models.Product;
import jdk.jfr.Category;

import java.util.List;

public class MyOwnProductService implements ProductService {

    @Override
    public Product getSingleProduct(int productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createPProduct(String title, String description, double price, Category category, String imageURL) {
        return null;
    }
}

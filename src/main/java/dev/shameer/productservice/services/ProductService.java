package dev.shameer.productservice.services;

import dev.shameer.productservice.models.Category;
import dev.shameer.productservice.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();
    Product createProduct(String title,
                          String description,
                          double price,
                          String category,
                          String image
    );
}

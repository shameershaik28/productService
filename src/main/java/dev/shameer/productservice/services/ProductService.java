package dev.shameer.productservice.services;

import dev.shameer.productservice.models.Product;
import jdk.jfr.Category;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(int productId);
    List<Product> getAllProducts();
    Product createPProduct(String title,
                  String description,
                  double price,
                  Category category,
                  String imageURL
    );
}

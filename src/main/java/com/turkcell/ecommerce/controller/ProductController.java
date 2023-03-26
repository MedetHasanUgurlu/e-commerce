package com.turkcell.ecommerce.controller;

import com.turkcell.ecommerce.entity.Product;

import java.util.List;

public interface ProductController {
    void addProduct(Product product);
    Product getProductById(Long id);
    List<Product> getProducts();
    void deleteProductById(Long id);
    void updateProduct(Long id,Product product);
}

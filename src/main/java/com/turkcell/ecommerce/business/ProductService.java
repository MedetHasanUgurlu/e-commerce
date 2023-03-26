package com.turkcell.ecommerce.business;

import com.turkcell.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    void deleteProduct(Long id);
    Product getProductById(Long id);
    List<Product> getProducts();
    void updateProduct(Long id, Product product);
}

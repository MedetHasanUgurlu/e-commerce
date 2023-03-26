package com.turkcell.ecommerce.controller.impl;

import com.turkcell.ecommerce.controller.ProductController;
import com.turkcell.ecommerce.entity.Product;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductControllerImp implements ProductController {

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public void deleteProductById(Long id) {

    }

    @Override
    public void updateProduct(Long id, Product product) {

    }
}

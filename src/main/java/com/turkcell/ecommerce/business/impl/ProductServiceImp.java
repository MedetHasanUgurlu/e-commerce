package com.turkcell.ecommerce.business.impl;

import com.turkcell.ecommerce.business.ProductService;
import com.turkcell.ecommerce.entity.Product;
import com.turkcell.ecommerce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {

    private final ProductRepository repository;
    @Override
    public void addProduct(Product product) {
        repository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Product getProductById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @Override
    public void updateProduct(Long id, Product product) {
        Product x = repository.findById(id).get();
        x.setName(product.getName());
        x.setQuantity(product.getQuantity());
        x.setDescription(product.getDescription());
        x.setPrice(product.getPrice());
        repository.save(x);
    }
}

package com.demoms.demoMicroservice.Controller;

import com.demoms.demoMicroservice.Entity.Product;
import com.demoms.demoMicroservice.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping
    private List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping
    private Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

}

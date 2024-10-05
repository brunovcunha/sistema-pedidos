package com.brunov.sistemapedidos.controller;

import com.brunov.sistemapedidos.entity.Product;
import com.brunov.sistemapedidos.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductsController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> Products = productService.findAllProducts();
        return ResponseEntity.ok(Products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getAllCategories(@PathVariable Long id) {
        Product Product = productService.findProductById(id);
        return ResponseEntity.ok(Product);
    }

}

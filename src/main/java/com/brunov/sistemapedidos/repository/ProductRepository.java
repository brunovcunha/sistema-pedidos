package com.brunov.sistemapedidos.repository;

import com.brunov.sistemapedidos.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
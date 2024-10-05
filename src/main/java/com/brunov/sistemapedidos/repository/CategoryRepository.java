package com.brunov.sistemapedidos.repository;

import com.brunov.sistemapedidos.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
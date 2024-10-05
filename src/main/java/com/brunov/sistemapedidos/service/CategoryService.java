package com.brunov.sistemapedidos.service;

import com.brunov.sistemapedidos.entity.Category;
import com.brunov.sistemapedidos.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> findAllCategorys() {
        return categoryRepository.findAll();
    }

    public Category findCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }
}

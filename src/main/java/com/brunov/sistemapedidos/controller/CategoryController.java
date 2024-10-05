package com.brunov.sistemapedidos.controller;

import com.brunov.sistemapedidos.entity.Category;
import com.brunov.sistemapedidos.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategorys() {
        List<Category> Categorys = categoryService.findAllCategorys();
        return ResponseEntity.ok(Categorys);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getAllCategories(@PathVariable Long id) {
        Category Category = categoryService.findCategoryById(id);
        return ResponseEntity.ok(Category);
    }

}

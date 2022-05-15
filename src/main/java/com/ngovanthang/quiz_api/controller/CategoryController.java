package com.ngovanthang.quiz_api.controller;

import com.ngovanthang.quiz_api.dto.category.CategoryDTO;
import com.ngovanthang.quiz_api.entity.Category;
import com.ngovanthang.quiz_api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth/category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping()
    @Transactional
    public Category save(@RequestBody CategoryDTO categoryDTO){
        Category category = new Category();
        category.setName(categoryDTO.getName());
        return categoryRepository.save(category);
    }
}

package com.workintech.s18Challange.service;

import com.workintech.s18Challange.entity.Category;
import com.workintech.s18Challange.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;


    @Override
    public Category findById(long id) {
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        if (categoryOptional.isPresent()) {
            return categoryOptional.get();
        }

        throw new RuntimeException("Category is not found with given id: " + id);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }
}

package com.workintech.s18Challange.service;

import com.workintech.s18Challange.entity.Category;

public interface CategoryService {
    Category findById(long id);

    Category save(Category category);
}

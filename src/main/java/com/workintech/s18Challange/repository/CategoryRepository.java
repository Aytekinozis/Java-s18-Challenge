package com.workintech.s18Challange.repository;

import com.workintech.s18Challange.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}

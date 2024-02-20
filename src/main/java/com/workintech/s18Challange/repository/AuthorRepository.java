package com.workintech.s18Challange.repository;

import com.workintech.s18Challange.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}

package com.workintech.s18Challange.repository;

import com.workintech.s18Challange.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}

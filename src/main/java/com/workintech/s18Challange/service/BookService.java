package com.workintech.s18Challange.service;

import com.workintech.s18Challange.entity.Book;

public interface BookService {
    Book findById(long id);
    Book save(Book book);
}

package com.workintech.s18Challange.service;

import com.workintech.s18Challange.entity.Author;

public interface AuthorService {

    Author findById(long id);

    Author save(Author author);
}

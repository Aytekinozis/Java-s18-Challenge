package com.workintech.s18Challange.service;

import com.workintech.s18Challange.entity.Author;
import com.workintech.s18Challange.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService{

    private final AuthorRepository authorRepository;
    @Override
    public Author findById(long id) {
        Optional<Author> authorOptional = authorRepository.findById(id);
        if (authorOptional.isPresent()) {
            return authorOptional.get();
        }
        throw new RuntimeException("Author with given id is not found:" + id);
    }

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }
}

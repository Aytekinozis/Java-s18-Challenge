package com.workintech.s18Challange.controller;

import com.workintech.s18Challange.dto.AuthorResponse;
import com.workintech.s18Challange.dto.BookResponse;
import com.workintech.s18Challange.entity.Author;
import com.workintech.s18Challange.entity.Book;
import com.workintech.s18Challange.entity.Category;
import com.workintech.s18Challange.service.AuthorService;
import com.workintech.s18Challange.service.BookService;
import com.workintech.s18Challange.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;
    private final CategoryService categoryService;
    private final AuthorService authorService;

    @PostMapping("/{categoryId}")
    public BookResponse save(@RequestBody Book book, @PathVariable long categoryId) {
        Category category = categoryService.findById(categoryId);
        book.setCategory(category);
        category.addBook(book);
        bookService.save(book);
        return new BookResponse(book.getId(), book.getName(), category.getName(), null);
    }

    @PostMapping("/saveByAuthor")
    public BookResponse save(@RequestBody Book book, @RequestParam long categoryId, @RequestParam long authorId) {
        Category category = categoryService.findById(categoryId);
        book.setCategory(category);
        category.addBook(book);
        Author author = authorService.findById(authorId);
        book.setAuthor(author);
        author.addBook(book);

        bookService.save(book);

        return new BookResponse(book.getId(), book.getName(), category.getName(),
                new AuthorResponse(author.getId(), author.getFirstName() + " " + author.getLastName()));
    }
}

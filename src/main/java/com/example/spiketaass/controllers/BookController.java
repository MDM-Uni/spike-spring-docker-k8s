package com.example.spiketaass.controllers;

import com.example.spiketaass.models.Book;
import com.example.spiketaass.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

   @PostMapping("/books/create")
   @ResponseStatus(HttpStatus.OK)
    public void createBook(@RequestBody Book book) {
        bookRepository.save(book);
    }
}

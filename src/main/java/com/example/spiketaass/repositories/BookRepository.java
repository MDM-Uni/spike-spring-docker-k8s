package com.example.spiketaass.repositories;

import com.example.spiketaass.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}

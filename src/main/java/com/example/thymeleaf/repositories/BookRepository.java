package com.example.thymeleaf.repositories;

import com.example.thymeleaf.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}

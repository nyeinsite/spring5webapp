package com.example.thymeleaf.repositories;

import com.example.thymeleaf.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}

package com.example.thymeleaf.repositories;

import com.example.thymeleaf.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}

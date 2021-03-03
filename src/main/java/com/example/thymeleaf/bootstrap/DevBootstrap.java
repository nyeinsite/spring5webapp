package com.example.thymeleaf.bootstrap;

import com.example.thymeleaf.model.Author;
import com.example.thymeleaf.model.Book;
import com.example.thymeleaf.model.Publisher;
import com.example.thymeleaf.repositories.AuthorRepository;
import com.example.thymeleaf.repositories.BookRepository;
import com.example.thymeleaf.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
   private AuthorRepository authorRepository;
   private BookRepository bookRepository;
   private PublisherRepository publisherRepository;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
initData();
    }

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    private void initData(){
        Author author1=new Author("Nyein","Hello");
        Publisher publisher1=new Publisher("Su Su","Yangon");
        Book book1=new Book("Black Cat","12343",publisher1);
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);

        authorRepository.save(author1);
        bookRepository.save(book1);
        Author author2=new Author("Nyi","Vampire");
        Publisher publisher2=new Publisher("Aye Su","Bago");
        Book book2=new Book("Vampire","3221",publisher2);
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        authorRepository.save(author2);
        bookRepository.save(book2);
    }
}

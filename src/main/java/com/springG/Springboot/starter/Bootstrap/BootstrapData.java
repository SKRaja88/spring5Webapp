package com.springG.Springboot.starter.Bootstrap;

import com.springG.Springboot.starter.domain.Author;
import com.springG.Springboot.starter.domain.Books;
import com.springG.Springboot.starter.domain.Publisher;
import com.springG.Springboot.starter.repository.AuthorRepository;
import com.springG.Springboot.starter.repository.BookRepository;
import com.springG.Springboot.starter.repository.PublisherRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    PublisherRepository publisherRepository;

   private Logger log= LoggerFactory.getLogger(BootstrapData.class);

    @Override
    public void run(String... args) throws Exception {

        Author eric=new Author("Eric","Evans");
        Books ddd=new Books("Domain driven design","12121213");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        Author rod=new Author("Rod","Johnson");
        Books noEJB=new Books("J2EE development without EJB","39394949");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        log.info("Number of Books : "+bookRepository.count());

        Publisher publisher=new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("Evere");
        publisher.setState("Brussels");

        publisherRepository.save(publisher);

        log.info("Number of Publishers : "+publisherRepository.count());

        publisher.getBooks().add(ddd);
        ddd.setPublisher(publisher);

        publisher.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        publisherRepository.save(publisher);

        log.info("Number of books published : "+publisher.getBooks().size());


    }
}

package com.springG.Springboot.starter.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Books {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String title;
    private String isbn;

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @ManyToOne
    private Publisher  publisher;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    @ManyToMany
    @JoinTable (name="author_books", joinColumns = @JoinColumn(name="book_id"),
    inverseJoinColumns = @JoinColumn(name="author_id"))
    private Set<Author> authors = new HashSet();

    public Books() {
    }

    public Books(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Objects.equals(Id, books.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "Books{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authors=" + authors +
                '}';
    }
}

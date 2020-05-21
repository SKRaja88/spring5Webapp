package com.springG.Springboot.starter.repository;

import com.springG.Springboot.starter.domain.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books,Long> {
}

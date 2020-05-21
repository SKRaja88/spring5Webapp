package com.springG.Springboot.starter.repository;

import com.springG.Springboot.starter.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}

package com.springG.Springboot.starter.repository;

import com.springG.Springboot.starter.domain.Books;
import com.springG.Springboot.starter.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}

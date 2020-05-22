package com.springG.Springboot.starter.controller;

import com.springG.Springboot.starter.repository.AuthorRepository;
import com.springG.Springboot.starter.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

   @Autowired
    AuthorRepository authorRepository;

  @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors",authorRepository.findAll());
        return "books/authors/authorList";
    }

}

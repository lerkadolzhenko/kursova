package com.example.demo.controller;

import com.example.demo.model.Books;
import com.example.demo.service.books.impls.BooksServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class BooksController {
    @Autowired
    BooksServiceimpl BooksService;

    @RequestMapping("/Books")
    public List<Books> showBooks()
    {
        return BooksService.getAll();
    }
}

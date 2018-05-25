package com.example.demo.controller;

import com.example.demo.model.Booksdeliver;
import com.example.demo.service.booksdeliver.impls.BooksdeliverServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class BooksdeliverController {
    @Autowired
    BooksdeliverServiceimpl BooksdeliverService;

    @RequestMapping("/Booksdeliver")
    public List<Booksdeliver> showBooksdeliver()
    {
        return BooksdeliverService.getAll();
    }
}

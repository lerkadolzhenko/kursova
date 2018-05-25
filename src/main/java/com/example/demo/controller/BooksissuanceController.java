package com.example.demo.controller;

import com.example.demo.model.Booksissuance;
import com.example.demo.service.booksissuance.impls.BooksissuanceServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")

public class BooksissuanceController {
    @Autowired
    BooksissuanceServiceimpl BooksissuanceService;

    @RequestMapping("/Booksissuance")
    public List<Booksissuance> showBooksissuance()
    {
        return BooksissuanceService.getAll();
    }
}

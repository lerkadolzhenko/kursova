package com.example.demo.controller;

import com.example.demo.model.Bookstatus;
import com.example.demo.service.bookstatus.impls.BookstatusServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class BookstatusController {
    @Autowired
    BookstatusServiceimpl BookstatusService;

    @RequestMapping("/Bookstatus")
    public List<Bookstatus> showBookstatus()
    {
        return BookstatusService.getAll();
    }
}

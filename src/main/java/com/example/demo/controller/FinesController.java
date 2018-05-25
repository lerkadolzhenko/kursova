package com.example.demo.controller;

import com.example.demo.model.Fines;
import com.example.demo.service.fines.impls.FinesServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FinesController {

    @Autowired
    FinesServiceimpl FinesService;

    @RequestMapping("/Fines")
    public List<Fines> showFines()
    {
        return FinesService.getAll();
    }
    
}

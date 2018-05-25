package com.example.demo.controller;

import com.example.demo.model.Typefine;
import com.example.demo.service.typefine.impls.TypefineServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class TypefineController {
    @Autowired
    TypefineServiceimpl TypefineService;

    @RequestMapping("/Typefine")
    public List<Typefine> showTypefine()
    {
        return TypefineService.getAll();
    }
}

package com.example.demo.controller;

import com.example.demo.model.Persontypes;
import com.example.demo.service.persontypes.impls.PersontypesServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")

public class PersontypesController {
    @Autowired
    PersontypesServiceimpl PersontypesService;

    @RequestMapping("/Persontypes")
    public List<Persontypes> showPersontypes()
    {
        return PersontypesService.getAll();
    }
}

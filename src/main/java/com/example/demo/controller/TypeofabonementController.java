package com.example.demo.controller;

import com.example.demo.model.Typeofabonement;
import com.example.demo.service.typeofabonement.impls.TypeofabonementServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class TypeofabonementController {
    @Autowired
    TypeofabonementServiceimpl TypeofabonementService;

    @RequestMapping("/Typeofabonement")
    public List<Typeofabonement> showTypeofabonement()
    {
        return TypeofabonementService.getAll();
    }
}

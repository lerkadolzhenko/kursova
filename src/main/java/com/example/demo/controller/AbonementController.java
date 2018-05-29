package com.example.demo.controller;

import com.example.demo.model.Abonement;
import com.example.demo.service.abonement.impls.AbonementServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class AbonementController {
    @Autowired
    AbonementServiceimpl AbonementServiceimpl;

    @RequestMapping("/Abonement")
    public List<Abonement> showAbonement()
    {
        return AbonementServiceimpl.getAll();
    }
}
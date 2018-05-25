package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.person.impls.PersonServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class PersonController {
    @Autowired
    PersonServiceimpl PersonService;

    @RequestMapping("/Person")
    public List<Person> showPerson()
    {
        return PersonService.getAll();
    }
}

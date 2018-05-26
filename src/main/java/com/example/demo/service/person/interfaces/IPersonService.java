package com.example.demo.service.person.interfaces;

import com.example.demo.model.Person;

import java.util.List;

public interface IPersonService {
    public Person insertPerson(Person person);

    public Person getPerson(int id);

    public Person updatePerson(Person person);

    public void deletePerson(int id);

    public List<Person> getAll();
}

package com.example.demo.DAO.person.interfaces;

import com.example.demo.model.Person;

import java.util.List;

public interface IPersonDAO {
    public Person insertPerson(Person person);

    public Person getPerson(int id);

    public Person updatePerson(Person person);

    public Person deletePerson(int id);

    public List<Person> getAll();
}

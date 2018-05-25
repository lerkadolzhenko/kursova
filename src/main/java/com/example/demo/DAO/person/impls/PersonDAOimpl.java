package com.example.demo.DAO.person.impls;

import com.example.demo.DAO.person.interfaces.IPersonDAO;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PersonDAOimpl implements IPersonDAO{
    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Person insertPerson(Person person) {
        return null;
    }

    @Override
    public Person getPerson(int id) {
        return null;
    }

    @Override
    public Person updatePerson(Person person) {
        return null;
    }

    @Override
    public Person deletePerson(int id) {
        return null;
    }

    @Override
    public List<Person> getAll() {
        return dataStorage.getPerson() ;
    }
}

package com.example.demo.service.person.impls;

import com.example.demo.DAO.person.impls.PersonDAOimpl;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Person;
import com.example.demo.model.Person;
import com.example.demo.service.person.interfaces.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceimpl implements IPersonService {
    @Autowired
    PersonDAOimpl PersonDAO;

    @Override
    public Person insertPerson(Person person) {
        return PersonDAO.insertPerson(person);
    }

    @Override
    public Person getPerson(int id) {
        return PersonDAO.getPerson(id);

    }

    @Override
    public Person updatePerson(Person person) {
        return PersonDAO.updatePerson(person);
    }

    @Override
    public Person deletePerson(int id) {
        return PersonDAO.deletePerson(id);
    }

    @Override
    public List<Person> getAll() {
        return PersonDAO.getAll().
                stream()
                .collect(Collectors.toList());
    }
}

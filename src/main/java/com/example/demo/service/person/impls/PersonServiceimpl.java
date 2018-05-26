package com.example.demo.service.person.impls;


import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.person.interfaces.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceimpl implements IPersonService {
    @Autowired
    PersonRepository personRepository;

    @Override
    public Person insertPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person getPerson(int id) {
        return personRepository.getOne(id);

    }

    @Override
    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePerson(int id) {
         personRepository.deleteById(id);
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }
}

package com.example.demo.service.persontypes.impls;

import com.example.demo.model.Persontypes;
import com.example.demo.model.Persontypes;
import com.example.demo.repository.PersontypesRepository;
import com.example.demo.service.persontypes.interfaces.IPersontypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersontypesServiceimpl implements IPersontypesService {
    @Autowired
    PersontypesRepository persontypesRepository;

    @Override
    public Persontypes insertPersontypes(Persontypes persontypes) {
        return persontypesRepository.save(persontypes);
    }

    @Override
    public Persontypes getPersontypes(int id) {
        return persontypesRepository.getOne(id);

    }

    @Override
    public Persontypes updatePersontypes(Persontypes persontypes) {
        return persontypesRepository.save(persontypes);
    }

    @Override
    public void deletePersontypes(int id) {
         persontypesRepository.deleteById(id);
    }

    @Override
    public List<Persontypes> getAll() {
        return persontypesRepository.findAll();
    }
}

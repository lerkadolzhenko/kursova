package com.example.demo.service.persontypes.impls;

import com.example.demo.DAO.persontypes.impls.PersontypesDAOimpl;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Persontypes;
import com.example.demo.model.Persontypes;
import com.example.demo.service.persontypes.interfaces.IPersontypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersontypesServiceimpl implements IPersontypesService {
    @Autowired
    PersontypesDAOimpl PersontypesDAO;

    @Override
    public Persontypes insertPersontypes(Persontypes persontypes) {
        return PersontypesDAO.insertPersontypes(persontypes);
    }

    @Override
    public Persontypes getPersontypes(int id) {
        return PersontypesDAO.getPersontypes(id);

    }

    @Override
    public Persontypes updatePersontypes(Persontypes persontypes) {
        return PersontypesDAO.updatePersontypes(persontypes);
    }

    @Override
    public Persontypes deletePersontypes(int id) {
        return PersontypesDAO.deletePersontypes(id);
    }

    @Override
    public List<Persontypes> getAll() {
        return PersontypesDAO.getAll().
                stream()
                .collect(Collectors.toList());
    }
}

package com.example.demo.DAO.persontypes.impls;

import com.example.demo.DAO.persontypes.interfaces.IPersontypesDAO;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Persontypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PersontypesDAOimpl implements IPersontypesDAO{
    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Persontypes insertPersontypes(Persontypes persontypes) {
        return null;
    }

    @Override
    public Persontypes getPersontypes(int id) {
        return null;
    }

    @Override
    public Persontypes updatePersontypes(Persontypes persontypes) {
        return null;
    }

    @Override
    public Persontypes deletePersontypes(int id) {
        return null;
    }

    @Override
    public List<Persontypes> getAll() {
        return dataStorage.getPersontypes() ;
    }
}

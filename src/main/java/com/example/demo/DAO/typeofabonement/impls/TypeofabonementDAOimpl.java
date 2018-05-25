package com.example.demo.DAO.typeofabonement.impls;

import com.example.demo.DAO.typeofabonement.interfaces.ITypeofabonementDAO;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Typeofabonement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class TypeofabonementDAOimpl implements ITypeofabonementDAO{
    @Autowired
    DataStorageFake dataStorage;


    @Override
    public Typeofabonement insertTypeofabonement(Typeofabonement typeofabonement) {
        return null;
    }

    @Override
    public Typeofabonement getTypeofabonement(int id) {
        return null;
    }

    @Override
    public Typeofabonement updateTypeofabonement(Typeofabonement typeofabonement) {
        return null;
    }

    @Override
    public Typeofabonement deleteTypeofabonement(int id) {
        return null;
    }

    @Override
    public List<Typeofabonement> getAll() {
        return dataStorage.getTypeofabonement();
    }
}

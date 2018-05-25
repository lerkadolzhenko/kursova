package com.example.demo.DAO.abonement.impls;

import com.example.demo.DAO.abonement.interfaces.IAbonementDAO;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Abonement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class AbonementDAOimpl implements IAbonementDAO{

    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Abonement insertAbonement(Abonement abonement) {
        return null;
    }

    @Override
    public Abonement getAbonement(int id) {
        return null;
    }

    @Override
    public Abonement updateAbonement(Abonement abonement) {
        return null;
    }

    @Override
    public Abonement deleteAbonement(int id) {
        return null;
    }

    @Override
    public List<Abonement> getAll() {
        return dataStorage.getAbonement() ;
    }
}

package com.example.demo.DAO.fines.impls;

import com.example.demo.DAO.fines.interfaces.IFinesDAO;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Fines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FinesDAOimpl implements IFinesDAO {
    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Fines insertFines(Fines fines) {
        return null;
    }

    @Override
    public Fines getFines(int id) {
        return null;
    }

    @Override
    public Fines updateFines(Fines fines) {
        return null;
    }

    @Override
    public Fines deleteFines(int id) {
        return null;
    }

    @Override
    public List<Fines> getAll() {
        return dataStorage.getFines() ;
    }
}

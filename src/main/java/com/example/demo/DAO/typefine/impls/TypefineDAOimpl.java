package com.example.demo.DAO.typefine.impls;

import com.example.demo.DAO.typefine.interfaces.ITypefineDAO;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Typefine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class TypefineDAOimpl implements ITypefineDAO{
    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Typefine insertTypefine(Typefine typefine) {
        return null;
    }

    @Override
    public Typefine getTypefine(int id) {
        return null;
    }

    @Override
    public Typefine updateTypefine(Typefine typefine) { return null; }

    @Override
    public Typefine deleteTypefine(int id) {
        return null;
    }

    @Override
    public List<Typefine> getAll() {
        return dataStorage.getTypefine() ;
    }
}

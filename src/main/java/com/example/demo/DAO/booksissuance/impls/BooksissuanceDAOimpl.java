package com.example.demo.DAO.booksissuance.impls;

import com.example.demo.DAO.booksissuance.interfaces.IBooksissuanceDAO;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Booksissuance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BooksissuanceDAOimpl implements IBooksissuanceDAO {
    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Booksissuance insertBooksissuance(Booksissuance booksissuance) {
        return null;
    }

    @Override
    public Booksissuance getBooksissuance(int id) {
        return null;
    }

    @Override
    public Booksissuance updateBooksissuance(Booksissuance booksissuance) {
        return null;
    }

    @Override
    public Booksissuance deleteBooksissuance(int id) {
        return null;
    }

    @Override
    public List<Booksissuance> getAll() {
        return dataStorage.getBooksissuance() ;
    }
}

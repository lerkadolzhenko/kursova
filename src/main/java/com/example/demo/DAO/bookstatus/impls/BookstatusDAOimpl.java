package com.example.demo.DAO.bookstatus.impls;

import com.example.demo.DAO.bookstatus.interfaces.IBookstatusDAO;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Bookstatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BookstatusDAOimpl implements IBookstatusDAO {
    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Bookstatus insertBookstatus(Bookstatus bookstatus) {
        return null;
    }

    @Override
    public Bookstatus getBookstatus(int id) {
        return null;
    }

    @Override
    public Bookstatus updateBookstatus(Bookstatus bookstatus) {
        return null;
    }

    @Override
    public Bookstatus deleteBookstatus(int id) {
        return null;
    }

    @Override
    public List<Bookstatus> getAll() {
        return dataStorage.getBookstatus() ;
    }
}

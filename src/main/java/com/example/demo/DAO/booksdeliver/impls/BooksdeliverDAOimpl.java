package com.example.demo.DAO.booksdeliver.impls;

import com.example.demo.DAO.booksdeliver.interfaces.IBooksdeliverDAO;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Booksdeliver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BooksdeliverDAOimpl implements IBooksdeliverDAO {
    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Booksdeliver insertBooksdeliver(Booksdeliver booksdeliver) {
        return null;
    }

    @Override
    public Booksdeliver getBooksdeliver(int id) {
        return null;
    }

    @Override
    public Booksdeliver updateBooksdeliver(Booksdeliver booksdeliver) {
        return null;
    }

    @Override
    public Booksdeliver deleteBooksdeliver(int id) {
        return null;
    }

    @Override
    public List<Booksdeliver> getAll() {
        return dataStorage.getBooksdeliver() ;
    }
}
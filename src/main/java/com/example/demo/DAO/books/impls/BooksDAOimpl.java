package com.example.demo.DAO.books.impls;

import com.example.demo.DAO.books.interfaces.IBooksDAO;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BooksDAOimpl implements IBooksDAO{

    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Books insertBooks(Books books) {
        return null;
    }

    @Override
    public Books getBooks(int id) {
        return null;
    }

    @Override
    public Books updateBooks(Books books) {
        return null;
    }

    @Override
    public Books deleteBooks(int id) {
        return null;
    }

    @Override
    public List<Books> getAll() {
        return dataStorage.getBooks() ;
    }
}

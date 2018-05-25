package com.example.demo.DAO.books.interfaces;

import com.example.demo.model.Books;

import java.util.List;

public interface IBooksDAO {
    public Books insertBooks(Books books);

    public Books getBooks(int id);

    public Books updateBooks(Books books);

    public Books deleteBooks(int id);

    public List<Books> getAll();
}

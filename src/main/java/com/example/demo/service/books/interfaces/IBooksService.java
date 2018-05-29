package com.example.demo.service.books.interfaces;

import com.example.demo.model.Books;

import java.util.List;

public interface IBooksService {
    public Books insertBooks(Books books);

    public Books getBooks(int id);

    public Books updateBooks(Books books);

    public void deleteBooks(int id);

    public List<Books> getAll();
}

package com.example.demo.service.booksdeliver.interfaces;

import com.example.demo.model.Booksdeliver;

import java.util.List;

public interface IBooksdeliverService {
    public Booksdeliver insertBooksdeliver(Booksdeliver booksdeliver);

    public Booksdeliver getBooksdeliver(int id);

    public Booksdeliver updateBooksdeliver(Booksdeliver booksdeliver);

    public void deleteBooksdeliver(int id);

    public List<Booksdeliver> getAll();
}

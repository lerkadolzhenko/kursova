package com.example.demo.DAO.booksdeliver.interfaces;

import com.example.demo.model.Booksdeliver;

import java.util.List;

public interface IBooksdeliverDAO {
    public Booksdeliver insertBooksdeliver(Booksdeliver booksdeliver);

    public Booksdeliver getBooksdeliver(int id);

    public Booksdeliver updateBooksdeliver(Booksdeliver booksdeliver);

    public Booksdeliver deleteBooksdeliver(int id);

    public List<Booksdeliver> getAll();
}

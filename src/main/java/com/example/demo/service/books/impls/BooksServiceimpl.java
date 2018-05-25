package com.example.demo.service.books.impls;

import com.example.demo.DAO.books.impls.BooksDAOimpl;
import com.example.demo.model.Books;
import com.example.demo.service.books.interfaces.IBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BooksServiceimpl implements IBooksService {

    @Autowired
    BooksDAOimpl BooksDAO;

    @Override
    public Books insertBooks(Books books) {
        return BooksDAO.insertBooks(books);
    }

    @Override
    public Books getBooks(int id) {
        return BooksDAO.getBooks(id);

    }

    @Override
    public Books updateBooks(Books books) {
        return BooksDAO.updateBooks(books);
    }

    @Override
    public Books deleteBooks(int id) {
        return BooksDAO.deleteBooks(id);
    }

    @Override
    public List<Books> getAll() {
        return BooksDAO.getAll().
                stream()
                .collect(Collectors.toList());
    }
}

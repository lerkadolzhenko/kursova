package com.example.demo.service.booksdeliver.impls;

import com.example.demo.DAO.booksdeliver.impls.BooksdeliverDAOimpl;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Booksdeliver;
import com.example.demo.model.Booksdeliver;
import com.example.demo.service.booksdeliver.interfaces.IBooksdeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BooksdeliverServiceimpl implements IBooksdeliverService {
    @Autowired
    BooksdeliverDAOimpl BooksdeliverDAO;

    @Override
    public Booksdeliver insertBooksdeliver(Booksdeliver booksdeliver) {
        return BooksdeliverDAO.insertBooksdeliver(booksdeliver);
    }

    @Override
    public Booksdeliver getBooksdeliver(int id) {
        return BooksdeliverDAO.getBooksdeliver(id);

    }

    @Override
    public Booksdeliver updateBooksdeliver(Booksdeliver booksdeliver) {
        return BooksdeliverDAO.updateBooksdeliver(booksdeliver);
    }

    @Override
    public Booksdeliver deleteBooksdeliver(int id) {
        return BooksdeliverDAO.deleteBooksdeliver(id);
    }

    @Override
    public List<Booksdeliver> getAll() {
        return BooksdeliverDAO.getAll().
                stream()
                .collect(Collectors.toList());
    }
}
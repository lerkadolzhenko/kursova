package com.example.demo.service.booksissuance.impls;

import com.example.demo.DAO.booksissuance.impls.BooksissuanceDAOimpl;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Booksissuance;
import com.example.demo.model.Booksissuance;
import com.example.demo.service.booksissuance.interfaces.IBooksissuanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BooksissuanceServiceimpl implements IBooksissuanceService {
    @Autowired
    BooksissuanceDAOimpl BooksissuanceDAO;

    @Override
    public Booksissuance insertBooksissuance(Booksissuance booksissuance) {
        return BooksissuanceDAO.insertBooksissuance(booksissuance);
    }

    @Override
    public Booksissuance getBooksissuance(int id) {
        return BooksissuanceDAO.getBooksissuance(id);

    }

    @Override
    public Booksissuance updateBooksissuance(Booksissuance booksissuance) {
        return BooksissuanceDAO.updateBooksissuance(booksissuance);
    }

    @Override
    public Booksissuance deleteBooksissuance(int id) {
        return BooksissuanceDAO.deleteBooksissuance(id);
    }

    @Override
    public List<Booksissuance> getAll() {
        return BooksissuanceDAO.getAll().
                stream()
                .collect(Collectors.toList());
    }
}

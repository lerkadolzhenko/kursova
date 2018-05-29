package com.example.demo.service.booksissuance.impls;

import com.example.demo.model.Booksissuance;
import com.example.demo.model.Booksissuance;
import com.example.demo.repository.BooksIssuanceRepository;
import com.example.demo.service.booksissuance.interfaces.IBooksissuanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BooksissuanceServiceimpl implements IBooksissuanceService {
    @Autowired
    BooksIssuanceRepository BooksissuanceRepository;

    @Override
    public Booksissuance insertBooksissuance(Booksissuance booksissuance) {
        return BooksissuanceRepository.save(booksissuance);
    }

    @Override
    public Booksissuance getBooksissuance(int id) {
        return BooksissuanceRepository.getOne(id);

    }

    @Override
    public Booksissuance updateBooksissuance(Booksissuance booksissuance) {
        return BooksissuanceRepository.save(booksissuance);
    }

    @Override
    public void deleteBooksissuance(int id) {
         BooksissuanceRepository.deleteById(id);
    }

    @Override
    public List<Booksissuance> getAll() {
        return BooksissuanceRepository.findAll();
                /*stream()
                .collect(Collectors.toList());*/
    }
}

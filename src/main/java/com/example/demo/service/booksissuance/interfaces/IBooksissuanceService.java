package com.example.demo.service.booksissuance.interfaces;

import com.example.demo.model.Booksissuance;

import java.util.List;

public interface IBooksissuanceService {
    public Booksissuance insertBooksissuance(Booksissuance booksissuance);

    public Booksissuance getBooksissuance(int id);

    public Booksissuance updateBooksissuance(Booksissuance booksissuance);

    public Booksissuance deleteBooksissuance(int id);

    public List<Booksissuance> getAll();
}

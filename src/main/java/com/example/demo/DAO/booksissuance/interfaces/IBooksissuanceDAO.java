package com.example.demo.DAO.booksissuance.interfaces;

import com.example.demo.model.Booksissuance;

import java.util.List;

public interface IBooksissuanceDAO {
    public Booksissuance insertBooksissuance(Booksissuance booksissuance);

    public Booksissuance getBooksissuance(int id);

    public Booksissuance updateBooksissuance(Booksissuance booksissuance);

    public Booksissuance deleteBooksissuance(int id);

    public List<Booksissuance> getAll();
}

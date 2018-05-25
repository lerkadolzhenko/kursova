package com.example.demo.DAO.bookstatus.interfaces;

import com.example.demo.model.Bookstatus;

import java.util.List;

public interface IBookstatusDAO {
    public Bookstatus insertBookstatus(Bookstatus bookstatus);

    public Bookstatus getBookstatus(int id);

    public Bookstatus updateBookstatus(Bookstatus bookstatus);

    public Bookstatus deleteBookstatus(int id);

    public List<Bookstatus> getAll();
}

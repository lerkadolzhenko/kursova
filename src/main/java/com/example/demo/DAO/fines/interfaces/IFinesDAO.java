package com.example.demo.DAO.fines.interfaces;

import com.example.demo.model.Fines;

import java.util.List;

public interface IFinesDAO {
    public Fines insertFines(Fines fines);

    public Fines getFines(int id);

    public Fines updateFines(Fines fines);

    public Fines deleteFines(int id);

    public List<Fines> getAll();
}

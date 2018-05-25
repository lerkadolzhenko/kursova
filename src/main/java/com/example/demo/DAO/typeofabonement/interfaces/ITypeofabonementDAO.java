package com.example.demo.DAO.typeofabonement.interfaces;

import com.example.demo.model.Typeofabonement;

import java.util.List;

public interface ITypeofabonementDAO {
    public Typeofabonement insertTypeofabonement(Typeofabonement typeofabonement);

    public Typeofabonement getTypeofabonement(int id);

    public Typeofabonement updateTypeofabonement(Typeofabonement typeofabonement);

    public Typeofabonement deleteTypeofabonement(int id);

    public List<Typeofabonement> getAll();
}

package com.example.demo.DAO.abonement.interfaces;

import com.example.demo.model.Abonement;

import java.util.List;

public interface IAbonementDAO {
    public Abonement insertAbonement(Abonement abonement);

    public Abonement getAbonement(int id);

    public Abonement updateAbonement(Abonement abonement);

    public Abonement deleteAbonement(int id);

    public List<Abonement> getAll();
}

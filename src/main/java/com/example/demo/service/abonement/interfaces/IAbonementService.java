package com.example.demo.service.abonement.interfaces;

import com.example.demo.model.Abonement;

import java.util.List;

public interface IAbonementService{
    public Abonement insertAbonement(Abonement abonement);

    public Abonement getAbonement(int id);

    public Abonement updateAbonement(Abonement abonement);

    public Abonement deleteAbonement(int id);

    public List<Abonement> getAll();
}

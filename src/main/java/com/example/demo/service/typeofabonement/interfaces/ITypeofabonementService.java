package com.example.demo.service.typeofabonement.interfaces;

import com.example.demo.model.Typeofabonement;

import java.util.List;

public interface ITypeofabonementService {
    public Typeofabonement insertTypeofabonement(Typeofabonement typeofabonement);

    public Typeofabonement getTypeofabonement(int id);

    public Typeofabonement updateTypeofabonement(Typeofabonement typeofabonement);

    public void deleteTypeofabonement(int id);

    public List<Typeofabonement> getAll();
}

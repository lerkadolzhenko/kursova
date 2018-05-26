package com.example.demo.service.persontypes.interfaces;

import com.example.demo.model.Persontypes;

import java.util.List;

public interface IPersontypesService {
    public Persontypes insertPersontypes(Persontypes persontypes);

    public Persontypes getPersontypes(int id);

    public Persontypes updatePersontypes(Persontypes persontypes);

    public void deletePersontypes(int id);

    public List<Persontypes> getAll();
}

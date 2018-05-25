package com.example.demo.DAO.persontypes.interfaces;

import com.example.demo.model.Persontypes;

import java.util.List;

public interface IPersontypesDAO {
    public Persontypes insertPersontypes(Persontypes persontypes);

    public Persontypes getPersontypes(int id);

    public Persontypes updatePersontypes(Persontypes persontypes);

    public Persontypes deletePersontypes(int id);

    public List<Persontypes> getAll();
}

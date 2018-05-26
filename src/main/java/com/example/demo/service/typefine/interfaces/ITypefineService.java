package com.example.demo.service.typefine.interfaces;

import com.example.demo.model.Typefine;

import java.util.List;

public interface ITypefineService {
    public Typefine insertTypefine(Typefine typefine);

    public Typefine getTypefine(int id);

    public Typefine updateTypefine(Typefine typefine);

    public void deleteTypefine(int id);

    public List<Typefine> getAll();
}

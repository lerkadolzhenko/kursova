package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Typefine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtypefine;
    private String typefine;
    private int coef;

    public Typefine(int idtypefine, String typefine, int coef) {
        this.idtypefine = idtypefine;
        this.typefine = typefine;
        this.coef = coef;
    }

    public Typefine() {
    }

    public int getIdtypefine() {
        return idtypefine;
    }

    public void setIdtypefine(int idtypefine) {
        this.idtypefine = idtypefine;
    }

    public String getTypefine() {
        return typefine;
    }

    public void setTypefine(String typefine) {
        this.typefine = typefine;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    @Override
    public String toString() {
        return "com.example.demo.model.Typefine{" +
                "idtypefine=" + idtypefine +
                ", com.example.demo.model.Typefine=" + typefine +
                ", coef=" + coef +
                '}';
    }
}

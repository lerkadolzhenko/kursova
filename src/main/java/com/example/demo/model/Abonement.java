package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static org.apache.coyote.http11.Constants.a;

public class Abonement {

    private int idabonement;
    private String nameperson;
    private String nametypeofabonement;
    private String  dateabonementbegin;
    private String dateabonementend;

    public Abonement() {
    }

    public Abonement(String nameperson, String nametypeofabonement, String dateabonementbegin, String dateabonementend) {
        this.nameperson = nameperson;
        this.nametypeofabonement = nametypeofabonement;
        this.dateabonementbegin = dateabonementbegin;
        this.dateabonementend = dateabonementend;
    }

    public Abonement(int idabonement, String nameperson, String nametypeofabonement, String dateabonementbegin, String dateabonementend) {
        this.idabonement = idabonement;
        this.nameperson = nameperson;
        this.nametypeofabonement = nametypeofabonement;
        this.dateabonementbegin = dateabonementbegin;
        this.dateabonementend = dateabonementend;
    }

    public int getIdabonement() {
        return idabonement;
    }

    public void setIdabonement(int idabonement) {
        this.idabonement = idabonement;
    }

    public String getNameperson() {
        return nameperson;
    }

    public void setNameperson(String nameperson) {
        this.nameperson = nameperson;
    }

    public String getNametypeofabonement() {
        return nametypeofabonement;
    }

    public void setNametypeofabonement(String nametypeofabonement) {
        this.nametypeofabonement = nametypeofabonement;
    }

    public String getDateabonementbegin() {
        return dateabonementbegin;
    }

    public void setDateabonementbegin(String dateabonementbegin) {
        this.dateabonementbegin = dateabonementbegin;
    }

    public String getDateabonementend() {
        return dateabonementend;
    }

    public void setDateabonementend(String dateabonementend) {
        this.dateabonementend = dateabonementend;
    }

    @Override
    public String toString() {
        return "Abonement{" +
                "idabonement=" + idabonement +
                ", nameperson='" + nameperson + '\'' +
                ", nametypeofabonement='" + nametypeofabonement + '\'' +
                ", dateabonementbegin=" + dateabonementbegin +
                ", dateabonementend=" + dateabonementend +
                '}';
    }
}
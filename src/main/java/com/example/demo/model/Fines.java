package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "fines")
@EntityListeners(AuditingEntityListener.class)
public class Fines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idfines;
    @ManyToOne
    private Typefine nametypefine;
    @ManyToOne
    private Abonement nameperson;
    private int sizeoffine;

    public Fines() {
    }

    public Fines(int idfines, Typefine nametypefine, Abonement nameperson, int sizeoffine) {
        this.idfines = idfines;
        this.nametypefine = nametypefine;
        this.nameperson = nameperson;
        this.sizeoffine = sizeoffine;
    }

    public int getIdfines() {
        return idfines;
    }

    public void setIdfines(int idfines) {
        this.idfines = idfines;
    }

    public Typefine getNametypefine() {
        return nametypefine;
    }

    public void setNametypefine(Typefine nametypefine) {
        this.nametypefine = nametypefine;
    }

    public Abonement getNameperson() {
        return nameperson;
    }

    public void setNameperson(Abonement nameperson) {
        this.nameperson = nameperson;
    }

    public int getSizeoffine() {
        return sizeoffine;
    }

    public void setSizeoffine(int sizeoffine) {
        this.sizeoffine = sizeoffine;
    }

    /*@Override
    public String toString() {
        return "Fines{" +
                "idfines=" + idfines +
                ", nametypefine='" + nametypefine + '\'' +
                ", nameperson='" + nameperson + '\'' +
                ", sizeoffine=" + sizeoffine +
                '}';
    }*/
}

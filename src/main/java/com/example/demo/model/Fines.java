package com.example.demo.model;

public class Fines {
    private int idfines;
    private String nametypefine;
    private String nameperson;
    private int sizeoffine;

    public Fines(int idfines, String nametypefine, String nameperson, int sizeoffine) {
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

    public String getNametypefine() {
        return nametypefine;
    }

    public void setNametypefine(String nametypefine) {
        this.nametypefine = nametypefine;
    }

    public String getNameperson() {
        return nameperson;
    }

    public void setNameperson(String nameperson) {
        this.nameperson = nameperson;
    }

    public int getSizeoffine() {
        return sizeoffine;
    }

    public void setSizeoffine(int sizeoffine) {
        this.sizeoffine = sizeoffine;
    }

    @Override
    public String toString() {
        return "Fines{" +
                "idfines=" + idfines +
                ", nametypefine='" + nametypefine + '\'' +
                ", nameperson='" + nameperson + '\'' +
                ", sizeoffine=" + sizeoffine +
                '}';
    }
}

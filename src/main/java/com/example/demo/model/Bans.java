package com.example.demo.model;

public class Bans {
    private int idbans;
    private String nameperson;
    private String dateofbegin;
    private String dateofend;

    public Bans(int idbans, String nameperson, String dateofbegin, String dateofend) {
        this.idbans = idbans;
        this.nameperson = nameperson;
        this.dateofbegin = dateofbegin;
        this.dateofend = dateofend;
    }

    public int getIdbans() {
        return idbans;
    }

    public void setIdbans(int idbans) {
        this.idbans = idbans;
    }

    public String getNameperson() {
        return nameperson;
    }

    public void setNameperson(String nameperson) {
        this.nameperson = nameperson;
    }

    public String getDateofbegin() {
        return dateofbegin;
    }

    public void setDateofbegin(String dateofbegin) {
        this.dateofbegin = dateofbegin;
    }

    public String getDateofend() {
        return dateofend;
    }

    public void setDateofend(String dateofend) {
        this.dateofend = dateofend;
    }

    @Override
    public String toString() {
        return "com.example.demo.model.Bans{" +
                "idbans=" + idbans +
                ", abonement_idabonement=" + nameperson +
                ", dateofbegin=" + dateofbegin +
                ", dateofend=" + dateofend +
                '}';
    }
}
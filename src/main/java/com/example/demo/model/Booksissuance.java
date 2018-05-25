package com.example.demo.model;

public class Booksissuance {
    private int idbooksissuance;
    private String namebook;
    private String nameperson;
    private String namebookstatus;
    private String namelocation;
    private String dateofissuance;
    private String dateofsurrending;

    public Booksissuance(int idbooksissuance, String namebook, String nameperson, String namebookstatus, String namelocation, String dateofissuance, String dateofsurrending) {
        this.idbooksissuance = idbooksissuance;
        this.namebook = namebook;
        this.nameperson = nameperson;
        this.namebookstatus = namebookstatus;
        this.namelocation = namelocation;
        this.dateofissuance = dateofissuance;
        this.dateofsurrending = dateofsurrending;
    }

    public int getIdbooksissuance() {
        return idbooksissuance;
    }

    public void setIdbooksissuance(int idbooksissuance) {
        this.idbooksissuance = idbooksissuance;
    }

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public String getNameperson() {
        return nameperson;
    }

    public void setNameperson(String nameperson) {
        this.nameperson = nameperson;
    }

    public String getNamebookstatus() {
        return namebookstatus;
    }

    public void setNamebookstatus(String namebookstatus) {
        this.namebookstatus = namebookstatus;
    }

    public String getNamelocation() {
        return namelocation;
    }

    public void setNamelocation(String namelocation) {
        this.namelocation = namelocation;
    }

    public String getDateofissuance() {
        return dateofissuance;
    }

    public void setDateofissuance(String dateofissuance) {
        this.dateofissuance = dateofissuance;
    }

    public String getDateofsurrending() {
        return dateofsurrending;
    }

    public void setDateofsurrending(String dateofsurrending) {
        this.dateofsurrending = dateofsurrending;
    }

    @Override
    public String toString() {
        return "Booksissuance{" +
                "idbooksissuance=" + idbooksissuance +
                ", namebook='" + namebook + '\'' +
                ", nameperson='" + nameperson + '\'' +
                ", namebookstatus='" + namebookstatus + '\'' +
                ", namelocation='" + namelocation + '\'' +
                ", dateofissuance=" + dateofissuance +
                ", dateofsurrending=" + dateofsurrending +
                '}';
    }
}

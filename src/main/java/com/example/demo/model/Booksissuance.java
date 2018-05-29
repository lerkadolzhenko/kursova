package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "booksissuance")
@EntityListeners(AuditingEntityListener.class)

public class Booksissuance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idbooksissuance;
    @ManyToOne
    private Books namebook;
    @ManyToOne
    private Abonement nameperson;
    @ManyToOne
    private Bookstatus namebookstatus;
    @ManyToOne
    private Location namelocation;
    private String dateofissuance;
    private String dateofsurrending;

    public Booksissuance() {
    }

    public Booksissuance(int idbooksissuance, Books namebook, Abonement nameperson, Bookstatus namebookstatus, Location namelocation, String dateofissuance, String dateofsurrending) {
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

    public Books getNamebook() {
        return namebook;
    }

    public void setNamebook(Books namebook) {
        this.namebook = namebook;
    }

    public Abonement getNameperson() {
        return nameperson;
    }

    public void setNameperson(Abonement nameperson) {
        this.nameperson = nameperson;
    }

    public Bookstatus getNamebookstatus() {
        return namebookstatus;
    }

    public void setNamebookstatus(Bookstatus namebookstatus) {
        this.namebookstatus = namebookstatus;
    }

    public Location getNamelocation() {
        return namelocation;
    }

    public void setNamelocation(Location namelocation) {
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

    /*@Override
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
    }*/
}

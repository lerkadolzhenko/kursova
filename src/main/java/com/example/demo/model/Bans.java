package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "bans")
@EntityListeners(AuditingEntityListener.class)
public class Bans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idbans;
    @ManyToOne
    private Abonement nameperson;
    private String dateofbegin;
    private String dateofend;

    public Bans(int idbans, Abonement nameperson, String dateofbegin, String dateofend) {
        this.idbans = idbans;
        this.nameperson = nameperson;
        this.dateofbegin = dateofbegin;
        this.dateofend = dateofend;
    }

    public Bans() {
    }

    public int getIdbans() {
        return idbans;
    }

    public void setIdbans(int idbans) {
        this.idbans = idbans;
    }

    public Abonement getNameperson() {
        return nameperson;
    }

    public void setNameperson(Abonement nameperson) {
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

    /*@Override
    public String toString() {
        return "com.example.demo.model.Bans{" +
                "idbans=" + idbans +
                ", abonement_idabonement=" + nameperson +
                ", dateofbegin=" + dateofbegin +
                ", dateofend=" + dateofend +
                '}';
    }*/
}
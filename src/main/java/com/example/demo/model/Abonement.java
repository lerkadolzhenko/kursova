package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

import static org.apache.coyote.http11.Constants.a;

@Entity
@Table(name = "abonement")
@EntityListeners(AuditingEntityListener.class)
public class Abonement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idabonement;
    @ManyToOne
    private Person nameperson;
    @ManyToOne
    private Typeofabonement nametypeofabonement;
    private String  dateabonementbegin;
    private String dateabonementend;

    public Abonement() {
    }

    public Abonement(int idabonement, Person nameperson, Typeofabonement nametypeofabonement, String dateabonementbegin, String dateabonementend) {
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

    public Person getNameperson() {
        return nameperson;
    }

    public void setNameperson(Person nameperson) {
        this.nameperson = nameperson;
    }

    public Typeofabonement getNametypeofabonement() {
        return nametypeofabonement;
    }

    public void setNametypeofabonement(Typeofabonement nametypeofabonement) { this.nametypeofabonement = nametypeofabonement; }

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

}
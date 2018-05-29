package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idperson;
    @ManyToOne
    private Persontypes typeOfPerson;
    private String nameperson;
    private String faculty;
    private String cathedra;
    private Integer groupe;

    public Person(Persontypes typeOfPerson, String nameperson, String faculty, String cathedra) {
        this.idperson = idperson;
        this.typeOfPerson = typeOfPerson;
        this.nameperson = nameperson;
        this.faculty = faculty;
        this.cathedra = cathedra;
        this.groupe = groupe;
    }

    public Person() {
    }

    public int getIdperson() {
        return idperson;
    }

    public void setIdperson(int idperson) {
        this.idperson = idperson;
    }

    public Persontypes gettypeOfPerson() {
        return typeOfPerson;
    }

    public void settypeOfPerson(Persontypes typeOfPerson) {
        this.typeOfPerson = typeOfPerson;
    }

    public String getNameperson() {
        return nameperson;
    }

    public void setNameperson(String nameperson) {
        this.nameperson = nameperson;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCathedra() {
        return cathedra;
    }

    public void setCathedra(String cathedra) {
        this.cathedra = cathedra;
    }

    public Integer getGroupe() {
        return groupe;
    }

    public void setGroupe(Integer groupe) {
        this.groupe = groupe;
    }
}

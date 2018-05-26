package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Persontypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpersontypes;

    private String typeOfPerson;

    public Persontypes(int idpersontypes, String typeOfPerson) {
        this.idpersontypes = idpersontypes;
        this.typeOfPerson = typeOfPerson;
    }

    public Persontypes() {
    }

    public int getIdpersontypes() {
        return idpersontypes;
    }

    public void setIdpersontypes(int idpersontypes) {
        this.idpersontypes = idpersontypes;
    }

    public String getTypeOfPerson() {
        return typeOfPerson;
    }

    public void setTypeOfPerson(String typeOfPerson) {
        this.typeOfPerson = typeOfPerson;
    }

}

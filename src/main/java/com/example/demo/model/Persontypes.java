package com.example.demo.model;

public class Persontypes {
    private int idpersontypes;
    private String typeOfPerson;

    public Persontypes(int idpersontypes, String typeOfPerson) {
        this.idpersontypes = idpersontypes;
        this.typeOfPerson = typeOfPerson;
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

    @Override
    public String toString() {
        return "Persontypes{" +
                "idpersontypes=" + idpersontypes +
                ", typeOfPerson=" + typeOfPerson +
                '}';
    }
}

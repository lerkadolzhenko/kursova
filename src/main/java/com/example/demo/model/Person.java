package com.example.demo.model;

public class Person {
    private int idperson;
    private String typeOfPerson;
    private String nameperson;
    private String faculty;
    private String cathedra;
    private int groupe;

    public Person(int idperson, String typeOfPerson, String nameperson, String faculty, String cathedra, int groupe) {
        this.idperson = idperson;
        this.typeOfPerson = typeOfPerson;
        this.nameperson = nameperson;
        this.faculty = faculty;
        this.cathedra = cathedra;
        this.groupe = groupe;
    }

    public int getIdperson() {
        return idperson;
    }

    public void setIdperson(int idperson) {
        this.idperson = idperson;
    }

    public String gettypeOfPerson() {
        return typeOfPerson;
    }

    public void settypeOfPerson(String typeOfPerson) {
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

    public int getGroupe() {
        return groupe;
    }

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }

    @Override
    public String toString() {
        return "com.example.demo.model.Person{" +
                "idperson=" + idperson +
                ", typeOfPerson_idtypeOfPerson=" + typeOfPerson +
                ", nameperson=" + nameperson +
                ", faculty=" + faculty +
                ", cathedra=" + cathedra +
                ", groupe=" + groupe +
                '}';
    }
}

package com.example.demo.modelJDBS;

public class Person {
  private Long idperson;
  private Long persontypes_idpersontypes;
  private String nameperson;
  private String faculty;
  private String cathedra;
  private Long groupe;

  public Long getIdperson() {
    return idperson;
  }

  public void setIdperson(Long idperson) {
    this.idperson = idperson;
  }

  public Long getPersontypes_idpersontypes() {
    return persontypes_idpersontypes;
  }

  public void setPersontypes_idpersontypes(Long persontypes_idpersontypes) {
    this.persontypes_idpersontypes = persontypes_idpersontypes;
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

  public Long getGroupe() {
    return groupe;
  }

  public void setGroupe(Long groupe) {
    this.groupe = groupe;
  }
}

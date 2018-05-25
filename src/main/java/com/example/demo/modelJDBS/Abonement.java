package com.example.demo.modelJDBS;

public class Abonement {
  private Long idabonement;
  private Long person_idperson;
  private Long typeofabonement_idtypeofabonement;
  private java.sql.Date dateabonementbegin;
  private java.sql.Date dateabonementend;

  public Long getIdabonement() {
    return idabonement;
  }

  public void setIdabonement(Long idabonement) {
    this.idabonement = idabonement;
  }

  public Long getPerson_idperson() {
    return person_idperson;
  }

  public void setPerson_idperson(Long person_idperson) {
    this.person_idperson = person_idperson;
  }

  public Long getTypeofabonement_idtypeofabonement() {
    return typeofabonement_idtypeofabonement;
  }

  public void setTypeofabonement_idtypeofabonement(Long typeofabonement_idtypeofabonement) {
    this.typeofabonement_idtypeofabonement = typeofabonement_idtypeofabonement;
  }

  public java.sql.Date getDateabonementbegin() {
    return dateabonementbegin;
  }

  public void setDateabonementbegin(java.sql.Date dateabonementbegin) {
    this.dateabonementbegin = dateabonementbegin;
  }

  public java.sql.Date getDateabonementend() {
    return dateabonementend;
  }

  public void setDateabonementend(java.sql.Date dateabonementend) {
    this.dateabonementend = dateabonementend;
  }
}

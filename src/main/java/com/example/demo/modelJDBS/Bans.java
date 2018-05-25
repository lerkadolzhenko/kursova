package com.example.demo.modelJDBS;

public class Bans {
  private Long idbans;
  private java.sql.Date dateofbegin;
  private java.sql.Date dateofend;
  private Long abonement_idabonement;

  public Long getIdbans() {
    return idbans;
  }

  public void setIdbans(Long idbans) {
    this.idbans = idbans;
  }

  public java.sql.Date getDateofbegin() {
    return dateofbegin;
  }

  public void setDateofbegin(java.sql.Date dateofbegin) {
    this.dateofbegin = dateofbegin;
  }

  public java.sql.Date getDateofend() {
    return dateofend;
  }

  public void setDateofend(java.sql.Date dateofend) {
    this.dateofend = dateofend;
  }

  public Long getAbonement_idabonement() {
    return abonement_idabonement;
  }

  public void setAbonement_idabonement(Long abonement_idabonement) {
    this.abonement_idabonement = abonement_idabonement;
  }
}

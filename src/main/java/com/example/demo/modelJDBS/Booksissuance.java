package com.example.demo.modelJDBS;

public class Booksissuance {
  private Long idbooksissuance;
  private java.sql.Date dateofissuance;
  private java.sql.Date dateofsurrending;
  private Long books_idbooks;
  private Long abonement_idabonement;
  private Long location_idlocation;
  private Long bookstatus_idbookstatus;

  public Long getIdbooksissuance() {
    return idbooksissuance;
  }

  public void setIdbooksissuance(Long idbooksissuance) {
    this.idbooksissuance = idbooksissuance;
  }

  public java.sql.Date getDateofissuance() {
    return dateofissuance;
  }

  public void setDateofissuance(java.sql.Date dateofissuance) {
    this.dateofissuance = dateofissuance;
  }

  public java.sql.Date getDateofsurrending() {
    return dateofsurrending;
  }

  public void setDateofsurrending(java.sql.Date dateofsurrending) {
    this.dateofsurrending = dateofsurrending;
  }

  public Long getBooks_idbooks() {
    return books_idbooks;
  }

  public void setBooks_idbooks(Long books_idbooks) {
    this.books_idbooks = books_idbooks;
  }

  public Long getAbonement_idabonement() {
    return abonement_idabonement;
  }

  public void setAbonement_idabonement(Long abonement_idabonement) {
    this.abonement_idabonement = abonement_idabonement;
  }

  public Long getLocation_idlocation() {
    return location_idlocation;
  }

  public void setLocation_idlocation(Long location_idlocation) {
    this.location_idlocation = location_idlocation;
  }

  public Long getBookstatus_idbookstatus() {
    return bookstatus_idbookstatus;
  }

  public void setBookstatus_idbookstatus(Long bookstatus_idbookstatus) {
    this.bookstatus_idbookstatus = bookstatus_idbookstatus;
  }
}

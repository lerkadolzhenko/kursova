package com.example.demo.modelJDBS;

public class Books {
  private Long idbooks;
  private String namebook;
  private String author;
  private Long year;
  private Long amount;
  private Long price;
  private Long location_idlocation;
  private Long amountdebtor;

  public Long getIdbooks() {
    return idbooks;
  }

  public void setIdbooks(Long idbooks) {
    this.idbooks = idbooks;
  }

  public String getNamebook() {
    return namebook;
  }

  public void setNamebook(String namebook) {
    this.namebook = namebook;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
    this.year = year;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public Long getLocation_idlocation() {
    return location_idlocation;
  }

  public void setLocation_idlocation(Long location_idlocation) {
    this.location_idlocation = location_idlocation;
  }

  public Long getAmountdebtor() {
    return amountdebtor;
  }

  public void setAmountdebtor(Long amountdebtor) {
    this.amountdebtor = amountdebtor;
  }
}

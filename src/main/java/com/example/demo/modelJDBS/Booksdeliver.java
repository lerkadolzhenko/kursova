package com.example.demo.modelJDBS;

public class Booksdeliver {
  private Long idbooksdeliver;
  private java.sql.Date datebooksdeliver;
  private Long amount;
  private Long books_idbooks;
  private Long location_idlocation;

  public Long getIdbooksdeliver() {
    return idbooksdeliver;
  }

  public void setIdbooksdeliver(Long idbooksdeliver) {
    this.idbooksdeliver = idbooksdeliver;
  }

  public java.sql.Date getDatebooksdeliver() {
    return datebooksdeliver;
  }

  public void setDatebooksdeliver(java.sql.Date datebooksdeliver) {
    this.datebooksdeliver = datebooksdeliver;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Long getBooks_idbooks() {
    return books_idbooks;
  }

  public void setBooks_idbooks(Long books_idbooks) {
    this.books_idbooks = books_idbooks;
  }

  public Long getLocation_idlocation() {
    return location_idlocation;
  }

  public void setLocation_idlocation(Long location_idlocation) {
    this.location_idlocation = location_idlocation;
  }
}

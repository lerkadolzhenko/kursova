package com.example.demo.model;

public class Books {
    private int idbooks;
    private String namelocation;
    private String namebook;
    private String author;
    private int year;
    private int amount;
    private int price;
    private int amountdebtor;

    public Books(int idbooks, String namelocation, String namebook, String author, int year, int amount, int price, int amountdebtor) {
        this.idbooks = idbooks;
        this.namelocation = namelocation;
        this.namebook = namebook;
        this.author = author;
        this.year = year;
        this.amount = amount;
        this.price = price;
        this.amountdebtor = amountdebtor;
    }

    public int getIdbooks() {
        return idbooks;
    }

    public void setIdbooks(int idbooks) {
        this.idbooks = idbooks;
    }

    public String getNamelocation() {
        return namelocation;
    }

    public void setNamelocation(String namelocation) {
        this.namelocation = namelocation;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmountdebtor() {
        return amountdebtor;
    }

    public void setAmountdebtor(int amountdebtor) {
        this.amountdebtor = amountdebtor;
    }

    @Override
    public String toString() {
        return "Books{" +
                "idbooks=" + idbooks +
                ", namelocation='" + namelocation + '\'' +
                ", namebook='" + namebook + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", amount=" + amount +
                ", price=" + price +
                ", amountdebtor=" + amountdebtor +
                '}';
    }
}
